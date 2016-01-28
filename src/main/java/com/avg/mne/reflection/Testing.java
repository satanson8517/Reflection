package com.avg.mne.reflection;

import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michal Nedbálek <michal.nedbalek@avg.com> on 28/01/2016
 */
public class Testing {

	public static void main(String[] args) {
//		Private p = new Private();

		try {
//			Class pClass = Class.forName("reflectionant.Private");
//			Class pClass = Class.forName("reflectionant.Private$Inner");
//			Class pClass = p.getClass();
//			System.out.println(pClass.getCanonicalName());
//			System.out.println(pClass.getName());
//			System.out.println(pClass.getSimpleName());
//			System.out.println();

			// modifiers are saved as bits in int
//			int modifiers = pClass.getModifiers();
//			System.out.println(Modifier.isAbstract(modifiers));
//			System.out.println(Modifier.isFinal(modifiers));
//			System.out.println(Modifier.isInterface(modifiers));
//			System.out.println(Modifier.isNative(modifiers));
//			System.out.println(Modifier.isPrivate(modifiers));
//			System.out.println(Modifier.isProtected(modifiers));
//			System.out.println(Modifier.isPublic(modifiers));
//			System.out.println(Modifier.isStatic(modifiers));
//			System.out.println(Modifier.isStrict(modifiers));
//			System.out.println(Modifier.isSynchronized(modifiers));
//			System.out.println(Modifier.isTransient(modifiers));
//			System.out.println(Modifier.isVolatile(modifiers));
//			System.out.println();

			// ONLY public !!!
//			Field[] fields = pClass.getFields();
//			System.out.println("All public fields:");
//			Arrays.asList(fields).stream().forEach(f -> System.out.println(f.getName()));
//			System.out.println();
//			
//			// all - public, protected, package protected, private
//			fields = pClass.getDeclaredFields();
//			System.out.println("All fields:");
//			Arrays.asList(fields).stream().forEach(f -> System.out.println(f.getName()));
//			System.out.println();
//			
//			// ONLY public !!!
//			Field testedField = pClass.getField("_public_");
//			System.out.println("Field tested:");
//			System.out.println(testedField.getName());
//			System.out.println();
//			
//			// all - public, protected, package protected, private
//			testedField = pClass.getDeclaredField("_private_");
//			System.out.println("Field tested:");
//			System.out.println(testedField.getName());
//			
//			System.out.println("Value:");
//			testedField.setAccessible(true);
//			System.out.println(testedField.get(p));
//			
//			System.out.println("Changed value:");
//			testedField.set(p, "_changed_value_");
//			System.out.println(testedField.get(p));
//			System.out.println();
			
			// USAGE
			Private p = new Private();
			Field changedField = p.getClass().getDeclaredField("_final_private_");
			changedField.setAccessible(true);
			changedField.set(p, "changed value");
			System.out.println(changedField.get(p));
			
			
			
		} catch (Exception ex) {
			Logger.getLogger(Testing.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
