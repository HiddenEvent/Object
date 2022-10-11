package test;


import code.TypeEnum;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

class CodeTest {

    @Test
    public void code() throws NoSuchFieldException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        System.out.println("test");

        TypeEnum.UserRoleType consult = TypeEnum.UserRoleType.valueOf("CONSULT");
        System.out.println(consult.getStatusMsg());

        Class<?>[] enums = TypeEnum.class.getClasses();
        for (Class<?> innerEnum : enums) {
            System.out.println(innerEnum.getName());
            Field[] declaredFields = innerEnum.getDeclaredFields();
            for (Field declaredField : declaredFields) {
                System.out.println(declaredField.getName());
            }
        }

//        Field field = this.getClass().getDeclaredField(name);
//        System.out.println(field);
//        field.set(this, Enum.valueOf((Class<Enum>) field.getType(), value));
//        System.out.println(consult.);
    }

}