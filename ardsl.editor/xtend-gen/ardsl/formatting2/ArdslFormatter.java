/**
 * generated by Xtext 2.28.0
 */
package ardsl.formatting2;

import Ontologicals.Attribute;
import Ontologicals.Ontological;
import Ontologicals.Reference;
import ardsl.services.ArdslGrammarAccess;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ArdslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private ArdslGrammarAccess _ardslGrammarAccess;

  protected void _format(final Ontological ontological, @Extension final IFormattableDocument document) {
    EList<Ontologicals.Class> _classes = ontological.getClasses();
    for (final Ontologicals.Class _class : _classes) {
      document.<Ontologicals.Class>format(_class);
    }
  }

  protected void _format(final Ontologicals.Class _class, @Extension final IFormattableDocument document) {
    EList<Attribute> _attributes = _class.getAttributes();
    for (final Attribute attribute : _attributes) {
      document.<Attribute>format(attribute);
    }
    EList<Reference> _references = _class.getReferences();
    for (final Reference reference : _references) {
      document.<Reference>format(reference);
    }
  }

  public void format(final Object _class, final IFormattableDocument document) {
    if (_class instanceof XtextResource) {
      _format((XtextResource)_class, document);
      return;
    } else if (_class instanceof Ontologicals.Class) {
      _format((Ontologicals.Class)_class, document);
      return;
    } else if (_class instanceof Ontological) {
      _format((Ontological)_class, document);
      return;
    } else if (_class instanceof EObject) {
      _format((EObject)_class, document);
      return;
    } else if (_class == null) {
      _format((Void)null, document);
      return;
    } else if (_class != null) {
      _format(_class, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(_class, document).toString());
    }
  }
}
