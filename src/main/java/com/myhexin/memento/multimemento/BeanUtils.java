package com.myhexin.memento.multimemento;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

public class BeanUtils {

    /**
     * 把bean的所有属性及数值放在map中
     * @param bean
     * @return
     */
    public static HashMap<String, Object> backupProp(Object bean) {

        HashMap<String, Object> result = new HashMap<>();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] propertyDescriptor = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor pd : propertyDescriptor) {
                String fieldName = pd.getName();
                Method getter = pd.getReadMethod();
                Object fieldValue = getter.invoke(bean,new Object[] {});
                if(!fieldName.equalsIgnoreCase("class")) {
                    result.put(fieldName,fieldValue);
                }
            }
        } catch (Exception e) {
            System.err.println("shit");
            e.printStackTrace();
        }
        return result;
    }

    public static void restoreProp(Object bean,HashMap<String,Object> propMap) {
        try{
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] propertyDescriptor = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor pd : propertyDescriptor) {
                String fieldName = pd.getName();
               if(propMap.containsKey(fieldName)) {
                   Method setter = pd.getWriteMethod();
                   setter.invoke(bean,new Object[]{propMap.get(fieldName)});
               }
            }
        }catch (Exception e) {
            System.err.println("shit");
            e.printStackTrace();
        }
    }

}
