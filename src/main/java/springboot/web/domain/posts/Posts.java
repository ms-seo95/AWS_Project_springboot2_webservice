package springboot.web.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity // 테이블과 링크될 클래스임을 나타냄
public class Posts {

    @Id // PK field
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK 생성 규칙
    private Long    id;

    @Column(length = 500, nullable = false) // Table Column -> 굳이 선언하지 않아도(속성 변경 시 사용) Column으로 선언 됨.
    private String  title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(Long id, String title, String content, String author) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
