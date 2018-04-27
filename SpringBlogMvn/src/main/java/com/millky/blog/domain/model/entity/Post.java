package com.millky.blog.domain.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//@Data
@Entity
//@NoArgsConstructor
public class Post {

	@Id
	@GeneratedValue
	int id;

	String subject;

	/*
	 * String userId; String name;
	 * 
	 * @Column(nullable = false) String title;
	 * 
	 * String sustitle;
	 */

	// @Lob
	@Column(length = 100000000)
	String content;

	Date regDate;

	/*
	 * Date updateDate;
	 * 
	 * private int categoryId;
	 * 
	 * @ManyToOne(fetch= FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "categoryId", insertable = false, updatable= false)
	 * private Category category;
	 * 
	 * @OneToMany(mappedBy = "post", fetch =FetchType.LAZY, cascade =
	 * {CascadeType.MERGE}) private List<PostTag> postTagList;
	 * 
	 * public Post(PostCommand postCommand) { BeanUtils.copyProperties(postCommand,
	 * this); }
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}
