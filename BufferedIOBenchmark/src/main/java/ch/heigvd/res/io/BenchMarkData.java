/*
 * Class containing specific data results from the BufferedIOBenchmark
 */
package ch.heigvd.res.io;

/**
 *
 * @author Ciani Antony
 */
public class BenchMarkData {
    public enum Operation{
        WRITE,
        READ;
    }
    
    private Operation operation;
    private BufferedIOBenchmark.IOStrategy stategy;
    private long fileSize;
    private int blockSize;
    private long duration;
    
    BenchMarkData(Operation operation, BufferedIOBenchmark.IOStrategy strategy, long fileSize, int blockSize, long duration){
        this.operation = operation;
        this.stategy = strategy;
        this.fileSize = fileSize;
        this.blockSize = blockSize;
        this.duration = duration;
        
    }

    public Operation getOperation() {
        return operation;
    }

    public BufferedIOBenchmark.IOStrategy getStategy() {
        return stategy;
    }

    public long getFileSize() {
        return fileSize;
    }

    public int getBlockSize() {
        return blockSize;
    }

    public long getDuration() {
        return duration;
    }
    

}
