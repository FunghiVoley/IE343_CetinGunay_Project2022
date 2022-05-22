import java.lang.Math;
import java.util.ArrayList;

import medianProblem.*;
public class App {
    public static void main(String[] args){
        Operators operator = new Operators();
        double[][] facs_coordinates = operator.createDistanceMatrix(5,2);
        double[][] points_coordinates = operator.createDistanceMatrix(20,2);
        Facility[] facs = new Facility[5];
        Point[] points = new Point [20];
        for (int i=0; i<facs.length;i++){
            Facility f1 = new Facility(i, facs_coordinates[i][0], facs_coordinates[i][1], 20*Math.random()+50);
            facs[i] = f1;
        }
        for (int i=0; i<points.length;i++){
            Point p1 = new Point (i, points_coordinates[i][0], points_coordinates[i][1], 2*Math.random()+1);
            points[i] = p1;
        }
        double[][] distanceMatrix = operator.distanceMatrix(facs, points);
        ArrayList<Facility> openedFacilities = new ArrayList<>();
        ArrayList<Point> unassignedPoints = new ArrayList<>();
        ArrayList<ArrayList<Point>> assignmentList = new ArrayList<>();
					       
        
        
        
        
					        int[][] Plant = operator.createDistanceMatrix(5,2);
					        
					        for(int i=0; i<distanceMatrix.length;i++) {
					        	
					        for(int j=0; j<distanceMatrix[j].length;j++) {
					        		
						        		
						        if(operator.findMinIndex(distanceMatrix[j][i])==facs_coordinates[j][i]) {
						        Plant[j][i]=facs_coordinates[j][i];
						        		
						        		for (int k=0; j<facs.length;j++){
						        		if(facs[k].getX()== Plant[j][0]&& facs[k].getY()== Plant[0][i]) { 
						        			openedFacilities.add(facs[j]);
						        		}
						        		 }
						        		}
						        	}
						        }
						        int[][] Nodes= operator.createDistanceMatrix(20,2);
						         		 
						        		for (int k=0; j<points.length;j++){
						        
						         		 if(points[k].getX()== Nodes[j][0]&& points[k].getY()== Nodes[0][i]) { 
						         			unassignedPoints.add(points[j]);
						
					    }
					         		 }}}
					

					                
					                 

                



