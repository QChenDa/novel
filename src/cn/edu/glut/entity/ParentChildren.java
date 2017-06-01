package cn.edu.glut.entity;

import cn.edu.glut.entity.ParentChildrenId;

/**
 * AbstractParentChildren entity provides the base persistence definition of the
 * ParentChildren entity. @author MyEclipse Persistence Tools
 */

public class ParentChildren  {

	// Fields

	private ParentChildrenId id;

	// Constructors

	/** default constructor */
	public ParentChildren() {
	}

	/** full constructor */
	public ParentChildren(ParentChildrenId id) {
		this.id = id;
	}

	// Property accessors

	public ParentChildrenId getId() {
		return this.id;
	}

	public void setId(ParentChildrenId id) {
		this.id = id;
	}

}