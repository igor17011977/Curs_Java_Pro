package dz08;

public class FileLoggerConfiguration {
    static String file;

    public String getName() {
        return file;
    }
    public void setName(String file) {
        this.file = file;
    }

  static String format;
    public String getFormat() {
        return this.format;
    }
    public void setFormat(String format) {
        this.format = format;
    }

    static String patch;
    public String getPatch() {
        return this.patch;
    }

    public void setPatch(String patch) {
        this.patch = patch;
    }

    static String level;
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }

    static long maxsize;
    public void setMaxsize(long maxsize) {
        this.maxsize = maxsize;
    }
    public long getMaxsize() {

        return maxsize;
    }
}
