/*
 * generated by Xtext 2.28.0
 */
package ardsl;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import Ontologicals.OntologicalsPackage;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class ArdslStandaloneSetup extends ArdslStandaloneSetupGenerated {

	public static void doSetup() {
		new ArdslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	public static void ardslToXmi(String input, String output) {
		// register URI of ecore meta-model
		EPackage.Registry.INSTANCE.put(OntologicalsPackage.eNS_URI, OntologicalsPackage.eINSTANCE);
		// create resource for xtext file
		Injector injector = new ArdslStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet xtextRS = injector.getInstance(XtextResourceSet.class);
		XtextResource xtextInput = (XtextResource)xtextRS.getResource(URI.createURI(input), true);
		EcoreUtil.resolveAll(xtextInput);
		// create empty xmi resource
		ResourceSet xmiRS = new ResourceSetImpl();
		Resource xmiOutput = xmiRS.createResource(URI.createURI(output));
		// save xtext resource in xmi resource
		xmiOutput.getContents().add(xtextInput.getContents().get(0));
		try {
			xmiOutput.save(null);
		} catch (IOException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
