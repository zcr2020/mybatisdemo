package com.chap61.dao;
/**
 * UserDAO�ӿ��ṩ���û���¼��֤�ķ���
 * @author Administrator
 *
 */
public interface UserDAO {
	/**
	 * ��¼��֤����
	 * @param loginId���û���
	 * @param loginPwd ������
	 * @return true:��¼�ɹ�   false����¼ʧ��
	 */
	public boolean doLogin(String loginId,String loginPwd);

}
