/**
 */
package Physics.util;

import Physics.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Physics.PhysicsPackage
 * @generated
 */
public class PhysicsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PhysicsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PhysicsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicsSwitch<Adapter> modelSwitch =
		new PhysicsSwitch<Adapter>() {
			@Override
			public Adapter casePhysic(Physic object) {
				return createPhysicAdapter();
			}
			@Override
			public Adapter casePhysicClass(PhysicClass object) {
				return createPhysicClassAdapter();
			}
			@Override
			public Adapter casePhysicBody(PhysicBody object) {
				return createPhysicBodyAdapter();
			}
			@Override
			public Adapter caseForce(Force object) {
				return createForceAdapter();
			}
			@Override
			public Adapter caseBitMasks(BitMasks object) {
				return createBitMasksAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Physics.Physic <em>Physic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Physics.Physic
	 * @generated
	 */
	public Adapter createPhysicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Physics.PhysicClass <em>Physic Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Physics.PhysicClass
	 * @generated
	 */
	public Adapter createPhysicClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Physics.PhysicBody <em>Physic Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Physics.PhysicBody
	 * @generated
	 */
	public Adapter createPhysicBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Physics.Force <em>Force</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Physics.Force
	 * @generated
	 */
	public Adapter createForceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Physics.BitMasks <em>Bit Masks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Physics.BitMasks
	 * @generated
	 */
	public Adapter createBitMasksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PhysicsAdapterFactory
