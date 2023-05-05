package arg;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

public class ArgValueConverter extends DefaultTerminalConverters {
	@ValueConverter(rule = "AttributeMax")
	public IValueConverter<Integer> AttributeMax() {
		return new IValueConverter<Integer>() {

			@Override
			public Integer toValue(String attr, INode node) throws ValueConverterException {
				if (Strings.isEmpty(attr))
                    throw new ValueConverterException("Attribute cannot be empty", node, null);
                else if ("*".equals(attr.trim()))
                    return -1;
                try {
                    return Integer.parseInt(attr);
                } catch (NumberFormatException e) {
                    throw new ValueConverterException(attr+"' is not number", node, e);
                }
			}

			@Override
			public String toString(Integer attr) throws ValueConverterException {
				 return ((attr == -1) ? "*" : Integer.toString(attr));
			}
		};
	}
}
