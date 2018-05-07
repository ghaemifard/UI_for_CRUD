package edu.aut.islab.ghaemi.minuy.generator.model;

import com.google.common.base.Objects;
import edu.aut.islab.ghaemi.minuy.generator.model.UNode;
import edu.aut.islab.ghaemi.minuy.myUiDsl.Body;
import edu.aut.islab.ghaemi.minuy.myUiDsl.Model;
import edu.aut.islab.ghaemi.minuy.myUiDsl.Node;
import edu.aut.islab.ghaemi.minuy.myUiDsl.SelfRepeat;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class Originate {
  public static void CompileModel(final Model m) {
    EList<Body> _bodis = m.getBodis();
    Originate.compileBodies(_bodis);
  }
  
  public static String tostring(final Node n) {
    char _name = n.getName();
    return Character.valueOf(_name).toString();
  }
  
  public static boolean makeNode(final Body b) {
    boolean _xblockexpression = false;
    {
      final ArrayList<UNode> arr = new ArrayList<UNode>();
      EList<Node> _right = b.getRight();
      final Consumer<Node> _function = (Node it) -> {
        char _name = it.getName();
        String _string = Character.valueOf(_name).toString();
        final UNode n = new UNode(_string);
        arr.add(n);
      };
      _right.forEach(_function);
      Node _name = b.getName();
      String _string = Originate.tostring(_name);
      _xblockexpression = UNode.addToNode(arr, _string);
    }
    return _xblockexpression;
  }
  
  public static boolean makeNode(final Body b, final boolean bs) {
    boolean _xblockexpression = false;
    {
      final ArrayList<UNode> arr = new ArrayList<UNode>();
      EList<Node> _right = b.getRight();
      final Consumer<Node> _function = (Node it) -> {
        char _name = it.getName();
        String _string = Character.valueOf(_name).toString();
        final UNode n = new UNode(_string, bs);
        arr.add(n);
      };
      _right.forEach(_function);
      Node _name = b.getName();
      String _string = Originate.tostring(_name);
      _xblockexpression = UNode.addToNode(arr, _string, bs);
    }
    return _xblockexpression;
  }
  
  public static void compileBodies(final List<Body> ls) {
    Body _get = ls.get(0);
    Node _name = _get.getName();
    String _string = Originate.tostring(_name);
    UNode _uNode = new UNode(_string);
    UNode.setRoot(_uNode);
    final Consumer<Body> _function = (Body it) -> {
      SelfRepeat _selfRepeat = it.getSelfRepeat();
      boolean _equals = Objects.equal(_selfRepeat, null);
      if (_equals) {
        Originate.makeNode(it);
      } else {
        SelfRepeat _selfRepeat_1 = it.getSelfRepeat();
        boolean _isVertical = _selfRepeat_1.isVertical();
        if (_isVertical) {
          SelfRepeat _selfRepeat_2 = it.getSelfRepeat();
          int _number = _selfRepeat_2.getNumber();
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(1, _number, true);
          for (final Integer i : _doubleDotLessThan) {
            Originate.makeNode(it, true);
          }
        } else {
          EList<Node> _right = it.getRight();
          final ArrayList<Node> cl = new ArrayList<Node>(_right);
          EList<Node> _right_1 = it.getRight();
          final Function1<Node, String> _function_1 = (Node it_1) -> {
            char _name_1 = it_1.getName();
            String _string_1 = Character.valueOf(_name_1).toString();
            return (_string_1 + "");
          };
          List<String> _map = ListExtensions.<Node, String>map(_right_1, _function_1);
          final String str = IterableExtensions.join(_map, ",");
          String str2 = str;
          Node _name_1 = it.getName();
          final String left = Originate.tostring(_name_1);
          SelfRepeat _selfRepeat_3 = it.getSelfRepeat();
          int _number_1 = _selfRepeat_3.getNumber();
          ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(1, _number_1, true);
          for (final Integer i_1 : _doubleDotLessThan_1) {
            Node _name_2 = it.getName();
            String _string_1 = Originate.tostring(_name_2);
            String _replaceAll = str2.replaceAll(_string_1, str);
            str2 = _replaceAll;
          }
          final ArrayList<UNode> arr = new ArrayList<UNode>();
          String[] _split = str2.split(",");
          final Function1<String, Boolean> _function_2 = (String it_1) -> {
            boolean _equals_1 = it_1.equals(left);
            return Boolean.valueOf((!_equals_1));
          };
          Iterable<String> _filter = IterableExtensions.<String>filter(((Iterable<String>)Conversions.doWrapArray(_split)), _function_2);
          final Consumer<String> _function_3 = (String it_1) -> {
            final UNode n = new UNode(it_1);
            arr.add(n);
          };
          _filter.forEach(_function_3);
          UNode.addToNode(arr, left);
        }
      }
    };
    ls.forEach(_function);
  }
}
