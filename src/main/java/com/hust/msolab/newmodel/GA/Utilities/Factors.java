package com.hust.msolab.newmodel.GA.Utilities;

import java.util.List;

public class Factors {
    // =========================================================================Only change for experiment=========================================================================
    // For genetic algorithm
    public static int GA_LOOP = 400;
    public static int GA_POPULATION_SIZE = 250;

    // For crossover operators
    public static double GA_CROSSOVER_PROBABILITY = 0.5;
    public static double GA_CHANGE_CROSSOVER_OPERATION_PROBABILITY1 = 0.01;
    public static double GA_CHANGE_CROSSOVER_OPERATION_PROBABILITY2 = 0.1;
    public static int GA_TOURNAMENT_SIZE = 5;
    public static int GA_PARENTS_PAIR_SIZE = 100;

    // For parent selection operator
    public static double GA_CHANGE_PARENT_SELECTION_OPERATOR_PROBABILITY1 = 0.6;

    // For mutation operators
    public static double GA_MUTATION_PROBABILITY = 0.1;
    public static double GA_CHANGE_MUTATION_OPERATION_PROBABILITY1 = 0.15;
    public static double GA_CHANGE_MUTATION_OPERATION_PROBABILITY2 = 0.0;

    // For natural selection operator
    public static double GA_DIVERSITY_THRESHOLD = 0.99;

    // For fitness functions
    public static double ALPHA = 0.5;
    public static double K = 0.01;

    // Choosing GA fitness function and operators
    // Best operators set: (5, 2, 1, 3)
    public static int GA_CHOSEN_FITNESS_FUNCTION = 8;               // values: 1, 2, 3, 4, 5, 6, 7, 8
    public static int GA_CHOSEN_CROSSOVER_FUNCTION = 5;             // values: 1, 2, 3, 4, 5, 6
    public static int GA_CHOSEN_MUTATION_FUNCTION = 3;              // values: 1, 2, 3, 4
    public static int GA_CHOSEN_NATURAL_SELECTION_FUNCTION = 1;     // values: 1, 2, 3
    public static int GA_CHOSEN_PARENTS_SELECTION_FUNCTION = 3;     // values: 1, 2, 3

    // Choosing data file for all data experiment
    public static String INPUT_FOLDER = "/home/dongocson/Documents/Work/Work/Document/LearningProgram/Project2/GA_NewModel/src/main/resources/" +
            "Data/Data3";
    public static String OUTPUT_FOLDER = "/home/dongocson/Documents/Work/Work/Document/LearningProgram/Project2/GA_NewModel/src/main/resources/" +
            "Result/ResultINMA";
    public static String PICTURE_FOLDER = "/home/dongocson/Documents/Work/Work/Document/LearningProgram/Project2/GA_NewModel/src/main/resources/" +
            "Image/Image3";

    // Choosing data file for single experiment
    public static String INPUT_FILE_PATH = "/home/dongocson/Documents/Work/Work/Document/LearningProgram/Project2/GA_NewModel/src/main/resources/" +
            "Data/Data1/Uniform_distribution_energy/normal_distribution_location/n90-far.txt";
    public static String OUTPUT_FILE_PATH = "/home/dongocson/Documents/Work/Work/Document/LearningProgram/Project2/GA_NewModel/src/main/resources/" +
            "Result/ResultINMA/Scenario1/normal_distribution_location/n90-far-inmaresult.txt";

    // Jmetal
    public static String JMETAL_OUTPUT_FOLDER = "/home/dongocson/Documents/Work/Work/Document/LearningProgram/Project2/GA_NewModel/src/main/resources/JMetal-Result";

    // INMA
    public static double DURING = 18236.19;
    public static double TIME_INTERVAL = 10.0;
    // =========================================================================================================================================================================



    // ==================================================Never make any change unless you know exactly what you're going to do==================================================

    // Fixed factors in WRSN
    public static double WCE_V = 5;
    public static double WCE_U = 5;
    public static double WCE_P_MOVE = 1;
    public static double WCE_Emc = 80000;
    public static double WCE_CHARGING_RATE = 10.0;

    public static double SERVICE_STATION_X = 0;
    public static double SERVICE_STATION_Y = 0;

    public static double SENSOR_Emin = 540;
    public static double SENSOR_Emax = 8000;
    public static final double SENSOR_E_THRES = 1500.0;

    public static double AREA_SIZE = 1000.0;

    // Store data scenario
    public static List<Double> REMAINING_ENERGIES;
    public static int NUM_OF_SENSORS;
    public static List<Double> P;
    public static double[][] distances;
    // =========================================================================================================================================================================

    // ========================This part is for data generation and visulization. Never make any change unless you know exactly what you're going to do ========================
    public static double DOT_SIZE = 10.0;
    public static int CHART_IMAGE_WIDTH = 1280;
    public static int CHART_IMAGE_HEIGHT = 1280;
    public static int CHART_PANEL_WIDTH = 1280;
    public static int CHART_PANEL_HEIGHT = 1280;
}
