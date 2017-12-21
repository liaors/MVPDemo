package com.rs.mvpdemo.model.bean;

/**
 * Created by Rs on 2017/12/19.
 */

public class PostBean {
    private FrontCoverBean frontCover;
    private String circleName;
    private int id;
    private boolean state;

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public FrontCoverBean getFrontCover() {
        return frontCover;
    }

    public void setFrontCover(FrontCoverBean frontCover) {
        this.frontCover = frontCover;
    }

    public String getCircleName() {
        return circleName;
    }

    public void setCircleName(String circleName) {
        this.circleName = circleName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static class FrontCoverBean {
        private String fileGroup;
        private String filePath;
        private String id;
        private String url;

        public String getFileGroup() {
            return fileGroup;
        }

        public void setFileGroup(String fileGroup) {
            this.fileGroup = fileGroup;
        }

        public String getFilePath() {
            return filePath;
        }

        public void setFilePath(String filePath) {
            this.filePath = filePath;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
