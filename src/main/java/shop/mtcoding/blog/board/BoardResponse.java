package shop.mtcoding.blog.board;

import lombok.Data;

public class BoardResponse {

    @Data
    public static class DetailDTO {
        private String author;
        private String title;
        private String content;
        private int Id;
    }
}
