/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.emc.recoverpoint.planning;

import java.lang.reflect.Field;

/**
 * <p>
 * This class provides methods for testing this component.
 * </p>
 *
 * @author TCSDEVELOPER
 * @version 1.0
 */
public class TestHelper {

    /**
     * Prevents this class being instantiated.
     */
    private TestHelper() {
        //empty constructor
    }

    /**
     * Gets the field value of the given object.
     *
     * @param obj The given object.
     * @param field The field name.
     * @return The field value.
     */
    public static Object getField(Object obj, String field) {
        Object value = null;
        try {
            Field declaredField = null;
            try {
                declaredField = obj.getClass().getDeclaredField(field);
            } catch (NoSuchFieldException e) {
                //OK
            }
            if (declaredField == null) {
                declaredField = obj.getClass().getSuperclass().getDeclaredField(field);
            }
            declaredField.setAccessible(true);
            value = declaredField.get(obj);
            declaredField.setAccessible(false);
        } catch (IllegalAccessException e) {
            //OK
        } catch (NoSuchFieldException e) {
            //OK
        }
        return value;
    }
}