package forum.post.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Post {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String content;
    private String publishDate;
    private int upVotes;
    private int downVotes;
    private String userName;
    private String profileURL;

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public String getPublishDate() {
        return this.publishDate;
    }

    public int getUpVotes() {
        return this.upVotes;
    }

    public int getDownVotes() {
        return this.downVotes;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getProfileURL() {
        return this.profileURL;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void setUpVotes(int upVotes) {
        this.upVotes = upVotes;
    }

    public void setDownVotes(int downVotes) {
        this.downVotes = downVotes;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setProfileURL(String profileURL) {
        this.profileURL = profileURL;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Post)) return false;
        final Post other = (Post) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$content = this.getContent();
        final Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        final Object this$publishDate = this.getPublishDate();
        final Object other$publishDate = other.getPublishDate();
        if (this$publishDate == null ? other$publishDate != null : !this$publishDate.equals(other$publishDate))
            return false;
        if (this.getUpVotes() != other.getUpVotes()) return false;
        if (this.getDownVotes() != other.getDownVotes()) return false;
        final Object this$userName = this.getUserName();
        final Object other$userName = other.getUserName();
        if (this$userName == null ? other$userName != null : !this$userName.equals(other$userName)) return false;
        final Object this$profileURL = this.getProfileURL();
        final Object other$profileURL = other.getProfileURL();
        if (this$profileURL == null ? other$profileURL != null : !this$profileURL.equals(other$profileURL))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Post;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId();
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        final Object $publishDate = this.getPublishDate();
        result = result * PRIME + ($publishDate == null ? 43 : $publishDate.hashCode());
        result = result * PRIME + this.getUpVotes();
        result = result * PRIME + this.getDownVotes();
        final Object $userName = this.getUserName();
        result = result * PRIME + ($userName == null ? 43 : $userName.hashCode());
        final Object $profileURL = this.getProfileURL();
        result = result * PRIME + ($profileURL == null ? 43 : $profileURL.hashCode());
        return result;
    }

    public String toString() {
        return "Post(id=" + this.getId() + ", title=" + this.getTitle() + ", content=" + this.getContent() + ", publishDate=" + this.getPublishDate() + ", upVotes=" + this.getUpVotes() + ", downVotes=" + this.getDownVotes() + ", userName=" + this.getUserName() + ", profileURL=" + this.getProfileURL() + ")";
    }
}
