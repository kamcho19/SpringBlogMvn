package com.millky.blog.domain.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

//@Data
@Getter
@Setter
@Entity
//@NoArgsConstructor
public class Post {

	@Id
	@GeneratedValue
	int id;
	
	@NotNull
	@Size(min=1, max =255)
	@Column(nullable = false)
	String title;
	
	@Size(max =255)
	String subtitle;



	/*
	 * String userId; String name;
	 * 
	 * @Column(nullable = false) String title;
	 * 
	 * String sustitle;
	 */

	// @Lob
	
	@NotNull
	@Size(min=1, max=100000000)
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


}
