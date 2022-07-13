package DAL;

import java.sql.ResultSet;
import Entity.DangNhapEntity;


public class DangNhapDAL 
{
    ResultSet rs = null;
    DBAccess data = new DBAccess();
    
    //kiểm tra tài khoản khi đăng nhập
    public ResultSet KiemtraTaiKhoan(DangNhapEntity dangnhapEntity) throws Exception
    {        
        String sql = "select * from USER_KHACHTHUE where Username = '"+dangnhapEntity.getUsername()+"' and pwd = '"+dangnhapEntity.getPwd()+"' and IsAdmin = 1";
        rs = data.executeQuery(sql);
        return rs;
    }
}
