package cn.enjoy.service;

/**
 * @author liaoqiangang
 * @date 2019/10/16 12:01 PM
 * @desc
 * @lastModifier
 * @lastModifyTime
 */
public interface IUserService {
  boolean login(String username, String passwd);

  boolean register(String username, String passwd);

  void batchAdd(String username, String passwd);
}
