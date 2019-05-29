package com.hust.msolab.newmodel.GA.Experiment.Experiment;

import com.hust.msolab.newmodel.GA.Algorithm.Individual;
import com.hust.msolab.newmodel.GA.Utilities.Factors;
import com.hust.msolab.newmodel.GA.Utilities.IOParser;
import com.hust.msolab.newmodel.GA.Algorithm.Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Experiment {

    public static int LOOP = 30;

    public static void main(String[] args){
        run(Factors.INPUT_FILE_PATH, Factors.OUTPUT_FILE_PATH);
    }

    public static void run(String inputFilePath, String outputFilePath){
        try{
            List<Individual> goodIndividuals = new ArrayList<>();
            List<Individual> badIndividuals = new ArrayList<>();

            System.out.println(inputFilePath);
            IOParser parser = new IOParser();
            parser.parseData(inputFilePath);
            for(int i = 0 ; i < LOOP ; i ++){
                Algorithm ag = new Algorithm();
                ag.solve();
                goodIndividuals.add(ag.getSolution());
                badIndividuals.add(ag.getBadSolution());
                System.out.print("====>");
            }
            System.out.println();

            Collections.sort(goodIndividuals, (i1, i2) ->  Double.compare( i1.getFitnessScore(), i2.getFitnessScore()));
            Collections.sort(badIndividuals, (i1, i2) ->  Double.compare( i1.getFitnessScore(), i2.getFitnessScore()));
            Individual bestInd = goodIndividuals.get(0);
            Individual worstInd = badIndividuals.get(badIndividuals.size() - 1);

            parser.output(bestInd, worstInd, outputFilePath);

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
