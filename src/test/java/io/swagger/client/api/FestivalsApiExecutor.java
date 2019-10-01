package io.swagger.client.api;

import io.swagger.client.model.Band;
import io.swagger.client.model.BandWithFest;
import io.swagger.client.model.MusicFestival;
import io.swagger.client.model.RecordLabel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class FestivalsApiExecutor {

    public static void main(String[] args) {

        FestivalsApi apiInstance = new FestivalsApi();
        try {
            List<MusicFestival> result = apiInstance.aPIFestivalsGet();

            List<RecordLabel> recordLables = new ArrayList<>();

            for(MusicFestival mf : result) {
               for(Band band: mf.getBands()){
                   RecordLabel rl = null;

                   boolean isExist=false;
                   for(RecordLabel ins: recordLables){

                       if(ins.getName().equalsIgnoreCase(band.getRecordLabel())) {
                            isExist = true;

                            List<BandWithFest> bandWithFests = ins.getBandWithFests();
                            BandWithFest bandWithFest;
                            boolean isBandExist=false;

                            for(BandWithFest bandInst: bandWithFests){
                                if(bandInst.getName().equalsIgnoreCase(band.getName())) {
                                    isExist = true;
                                    bandInst.getMusicFestivals().add(mf.getName());
                                }
                            }
                            if(!isBandExist) {
                                bandWithFest = new BandWithFest();
                                bandWithFest.setName(band.getName());

                                SortedSet<String> musicFestivals = new TreeSet<>();
                                musicFestivals.add(mf.getName());
                                bandWithFest.setMusicFestivals(musicFestivals);

                                ins.getBandWithFests().add(bandWithFest);

                            }
                        }
                   }

                   if(!isExist){
                       rl = new RecordLabel();
                       rl.setName(band.getRecordLabel());

                       List<BandWithFest> bandWithFests = new ArrayList<>();
                       BandWithFest bandWithFest;
                       boolean isBandExist=false;

                       for(BandWithFest bandInst: bandWithFests){
                           if(bandInst.getName().equalsIgnoreCase(band.getName())) {
                               isBandExist = true;
                               break;
                           }
                       }

                       if(!isBandExist) {
                           bandWithFest = new BandWithFest();
                           bandWithFest.setName(band.getName());

                           SortedSet<String> musicFestivals = new TreeSet<>();

                           musicFestivals.add(mf.getName());
                           bandWithFest.setMusicFestivals(musicFestivals);

                           bandWithFests.add(bandWithFest);

                       }


                       rl.setBandWithFests(bandWithFests);
                       recordLables.add(rl);

                   }

               }
            }

            Collections.sort(recordLables, Comparator.comparing((RecordLabel instrument) -> instrument.getName()));
            recordLables.stream().forEach(instance -> Collections.sort(instance.getBandWithFests(), Comparator.comparing((BandWithFest instrument) -> instrument.getName())));

            for(RecordLabel rl: recordLables){
                System.out.println("Record Label: "+ rl.getName());
                for(BandWithFest bandWithFest: rl.getBandWithFests()){
                    System.out.println("    Band: "+ bandWithFest.getName());
                    bandWithFest.getMusicFestivals().stream().forEach(fest -> System.out.println("        Festival: "+ fest));
                }
            }


        } catch (Exception e) {
            System.err.println("Exception when calling FestivalsApi#aPIFestivalsGet");
            e.printStackTrace();
        }
    }


}
