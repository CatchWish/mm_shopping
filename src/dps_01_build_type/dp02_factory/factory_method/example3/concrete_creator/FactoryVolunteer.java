package dps_01_build_type.dp02_factory.factory_method.example3.concrete_creator;

import dps_01_build_type.dp02_factory.factory_method.example3.concrete_product.Volunteer;
import dps_01_build_type.dp02_factory.factory_method.example3.creator.Factory;
import dps_01_build_type.dp02_factory.factory_method.example3.product.LeiFeng;

/**
 * ���幤����ɫ�������к;���ҵ���߼��йصĴ��롣��Ӧ�ó�������Դ�����Ӧ�ľ����Ʒ�Ķ���<br>
 * ����ѧ�׷�־Ը�ߵĹ���<br>
 * @author Administrator
 */
public class FactoryVolunteer implements Factory {

  /**
   * ����ѧ�׷��־Ը��<br>
   * @return LeiFeng
   */
  public LeiFeng createLeiFeng() {
    return new Volunteer();
  }

}