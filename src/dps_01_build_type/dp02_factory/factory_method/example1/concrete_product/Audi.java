package dps_01_build_type.dp02_factory.factory_method.example1.concrete_product;

import dps_01_build_type.dp02_factory.factory_method.example1.product.Car;

/**
 * �����Ʒ��ɫ:�µϳ�<br>
 * @author Administrator
 */
public class Audi implements Car {

  /**
   * ����������ʵ��
   */
  public void drive() {
    System.out.println("Driving Audi ");
  }

}