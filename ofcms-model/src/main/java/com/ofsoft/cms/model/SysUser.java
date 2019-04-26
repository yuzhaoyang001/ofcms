package com.ofsoft.cms.model;


import com.ofsoft.cms.model.base.BaseSysUser;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class SysUser extends BaseSysUser<SysUser> {
	public static final SysUser dao = new SysUser().dao();
	
	public SysUser setRoleId(Integer roleId) {
		set("role_id", roleId);
		return (SysUser) this;
	}
	public Integer getRoleId() {
		return getInt("role_id");
	}
}
