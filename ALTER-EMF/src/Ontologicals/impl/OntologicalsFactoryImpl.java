/**
 */
package Ontologicals.impl;

import Ontologicals.Attribute;
import Ontologicals.Ontological;
import Ontologicals.OntologicalsFactory;
import Ontologicals.OntologicalsPackage;
import Ontologicals.Reference;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OntologicalsFactoryImpl extends EFactoryImpl implements OntologicalsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OntologicalsFactory init() {
		try {
			OntologicalsFactory theOntologicalsFactory = (OntologicalsFactory)EPackage.Registry.INSTANCE.getEFactory(OntologicalsPackage.eNS_URI);
			if (theOntologicalsFactory != null) {
				return theOntologicalsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OntologicalsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologicalsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OntologicalsPackage.ONTOLOGICAL: return createOntological();
			case OntologicalsPackage.CLASS: return createClass();
			case OntologicalsPackage.ATTRIBUTE: return createAttribute();
			case OntologicalsPackage.REFERENCE: return createReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontological createOntological() {
		OntologicalImpl ontological = new OntologicalImpl();
		return ontological;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontologicals.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologicalsPackage getOntologicalsPackage() {
		return (OntologicalsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OntologicalsPackage getPackage() {
		return OntologicalsPackage.eINSTANCE;
	}

} //OntologicalsFactoryImpl
