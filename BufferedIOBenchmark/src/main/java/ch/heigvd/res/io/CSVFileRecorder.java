/*
 * Class useful to write CSV format lines from BenchmarkData object
 */
package ch.heigvd.res.io;

import java.io.*;

/**
 *
 * @author Ciani Antony
 */
public class CSVFileRecorder {

    private File outputFile;
    private PrintStream ps;
    
    public CSVFileRecorder (String filename) throws FileNotFoundException{
        
        outputFile = new File(filename);
        ps = new PrintStream(outputFile);
        
    }

    public void record(BenchMarkData data) {
        
        String line = "";
        line += data.getOperation().name() + ",";
        line += data.getStategy().name() + ",";
        line += data.getBlockSize() + ",";
        line += data.getFileSize() + ",";
        line += data.getDuration();
        
        ps.println(line);
    }
    
    public void recordHeaders(String headers){
        ps.println(headers);
    }

}
