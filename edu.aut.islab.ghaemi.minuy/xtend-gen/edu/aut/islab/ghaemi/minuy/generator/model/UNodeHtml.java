package edu.aut.islab.ghaemi.minuy.generator.model;

import com.google.common.base.Objects;
import edu.aut.islab.ghaemi.minuy.generator.model.UNode;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class UNodeHtml {
  public static String compile(final UNode n) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<");
    String _type = n.getType();
    _builder.append(_type, "");
    _builder.append(" ");
    {
      String _id = n.getId();
      boolean _notEquals = (!Objects.equal(_id, null));
      if (_notEquals) {
        _builder.append("\tid=\"");
        String _id_1 = n.getId();
        _builder.append(_id_1, "");
        _builder.append("\" ");
      }
    }
    {
      String _classes = n.getClasses();
      boolean _notEquals_1 = (!Objects.equal(_classes, null));
      if (_notEquals_1) {
        _builder.append(" class=\"");
        String _classes_1 = n.getClasses();
        _builder.append(_classes_1, "");
        _builder.append("\"");
      }
    }
    {
      String _feature = n.getFeature();
      boolean _notEquals_2 = (!Objects.equal(_feature, null));
      if (_notEquals_2) {
        _builder.append(" ");
        String _feature_1 = n.getFeature();
        _builder.append(_feature_1, "");
        _builder.append(" ");
      }
    }
    {
      String _style = n.getStyle();
      boolean _notEquals_3 = (!Objects.equal(_style, null));
      if (_notEquals_3) {
        _builder.append(" style=\"");
        String _style_1 = n.getStyle();
        _builder.append(_style_1, "");
        _builder.append("\"");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _content = n.getContent();
    _builder.append(_content, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    List<UNode> _silabs = n.getSilabs();
    final Function1<UNode, String> _function = (UNode it) -> {
      return UNodeHtml.compile(it);
    };
    List<String> _map = ListExtensions.<UNode, String>map(_silabs, _function);
    String _join = IterableExtensions.join(_map, "");
    _builder.append(_join, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("</");
    String _type_1 = n.getType();
    _builder.append(_type_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public static String produceFinalHtml(final List<String> css, final List<String> jss, final String code) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<meta charset=\"UTF-8\">");
    _builder.newLine();
    {
      for(final String ii : css) {
        _builder.append("<link type=\"text/css\" href=\"");
        _builder.append(ii, "");
        _builder.append("\" rel=\"stylesheet\">");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      for(final String ii_1 : jss) {
        _builder.append("<script type=\"text/javascript\" src=\"");
        _builder.append(ii_1, "");
        _builder.append("\"></script>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("<title>ChangeIt</title>");
    _builder.newLine();
    _builder.append("</head>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(code, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("</body>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder.toString();
  }
}
