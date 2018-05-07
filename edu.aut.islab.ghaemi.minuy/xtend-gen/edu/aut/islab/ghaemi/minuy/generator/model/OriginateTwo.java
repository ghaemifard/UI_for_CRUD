package edu.aut.islab.ghaemi.minuy.generator.model;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import edu.aut.islab.ghaemi.minuy.generator.model.CssDefinition;
import edu.aut.islab.ghaemi.minuy.generator.model.UNode;
import edu.aut.islab.ghaemi.minuy.myUiDsl.Accessory;
import edu.aut.islab.ghaemi.minuy.myUiDsl.Body;
import edu.aut.islab.ghaemi.minuy.myUiDsl.ClassName;
import edu.aut.islab.ghaemi.minuy.myUiDsl.ClassNameSec;
import edu.aut.islab.ghaemi.minuy.myUiDsl.CssStyle;
import edu.aut.islab.ghaemi.minuy.myUiDsl.Head;
import edu.aut.islab.ghaemi.minuy.myUiDsl.InnerClass;
import edu.aut.islab.ghaemi.minuy.myUiDsl.InnerFeature;
import edu.aut.islab.ghaemi.minuy.myUiDsl.InnerStyle;
import edu.aut.islab.ghaemi.minuy.myUiDsl.InnerText;
import edu.aut.islab.ghaemi.minuy.myUiDsl.InnerType;
import edu.aut.islab.ghaemi.minuy.myUiDsl.InnerTypeArray;
import edu.aut.islab.ghaemi.minuy.myUiDsl.Model;
import edu.aut.islab.ghaemi.minuy.myUiDsl.Node;
import edu.aut.islab.ghaemi.minuy.myUiDsl.SelfRepeat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class OriginateTwo {
  @Accessors(AccessorType.PUBLIC_SETTER)
  private static URI uri = null;
  
  @Accessors({ AccessorType.PUBLIC_SETTER, AccessorType.PUBLIC_GETTER })
  private static Resource res;
  
  @Accessors({ AccessorType.PUBLIC_SETTER, AccessorType.PUBLIC_GETTER })
  private final static ArrayList<String> cssz = new ArrayList<String>();
  
  @Accessors({ AccessorType.PUBLIC_SETTER, AccessorType.PUBLIC_GETTER })
  private final static ArrayList<String> jssz = new ArrayList<String>();
  
  private final static Map<String, Map<String, UNode>> map = new HashMap<String, Map<String, UNode>>();
  
  public static Object CompileModel(final Model m) {
    EList<Head> _heads = m.getHeads();
    OriginateTwo.loadImports(_heads);
    EList<Body> _bodis = m.getBodis();
    OriginateTwo.compileBodies(_bodis);
    EList<Accessory> _accessories = m.getAccessories();
    int _size = _accessories.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      String _string = OriginateTwo.uri.toString();
      Map<String, UNode> _get = OriginateTwo.map.get(_string);
      final BiConsumer<String, UNode> _function = (String p1, UNode p2) -> {
        UNode _root = UNode.getRoot();
        List<UNode> _silabs = _root.getSilabs();
        OriginateTwo.replaceUNodeWithFile(p1, _silabs, p2);
      };
      _get.forEach(_function);
    }
    EList<Accessory> _accessories_1 = m.getAccessories();
    OriginateTwo.compileAccessory(_accessories_1);
    return null;
  }
  
  public static void replaceUNodeWithFile(final String s, final List<UNode> ls, final UNode root) {
    int _size = ls.size();
    ExclusiveRange _greaterThanDoubleDot = new ExclusiveRange(_size, 0, false);
    for (final Integer i : _greaterThanDoubleDot) {
      UNode _get = ls.get((i).intValue());
      String _value = _get.getValue();
      boolean _equals = _value.equals(s);
      if (_equals) {
        UNode _get_1 = ls.get((i).intValue());
        ls.remove(_get_1);
        ls.add((i).intValue(), root);
      }
    }
    final Function1<UNode, Boolean> _function = (UNode it) -> {
      boolean _isApart = it.isApart();
      return Boolean.valueOf((!_isApart));
    };
    Iterable<UNode> _filter = IterableExtensions.<UNode>filter(ls, _function);
    final Consumer<UNode> _function_1 = (UNode it) -> {
      List<UNode> _silabs = it.getSilabs();
      OriginateTwo.replaceUNodeWithFile(s, _silabs, root);
    };
    _filter.forEach(_function_1);
  }
  
  public static URI loadImports(final List<Head> ls) {
    URI _xblockexpression = null;
    {
      final HashMap<String, UNode> m = new HashMap<String, UNode>();
      String _string = OriginateTwo.uri.toString();
      OriginateTwo.map.put(_string, m);
      final URI temp = OriginateTwo.uri;
      final Consumer<Head> _function = (Head it) -> {
        String _headType = it.getHeadType();
        boolean _equals = Objects.equal(_headType, "_CSS");
        if (_equals) {
          String _fileName = it.getFileName();
          OriginateTwo.cssz.add(_fileName);
        } else {
          String _headType_1 = it.getHeadType();
          boolean _equals_1 = Objects.equal(_headType_1, "_JS");
          if (_equals_1) {
            String _fileName_1 = it.getFileName();
            OriginateTwo.jssz.add(_fileName_1);
          } else {
            boolean _notEquals = (!Objects.equal(OriginateTwo.uri, null));
            if (_notEquals) {
              String _string_1 = OriginateTwo.uri.toString();
              InputOutput.<String>println(_string_1);
              String _string_2 = OriginateTwo.uri.toString();
              String _string_3 = OriginateTwo.uri.toString();
              int _lastIndexOf = _string_3.lastIndexOf("/");
              String _substring = _string_2.substring(0, _lastIndexOf);
              String _plus = (_substring + "/");
              String _fileName_2 = it.getFileName();
              String _plus_1 = (_plus + _fileName_2);
              String _plus_2 = (_plus_1 + ".myui");
              final URI u = URI.createURI(_plus_2);
              OriginateTwo.uri = u;
              String _string_4 = u.toString();
              InputOutput.<String>println(_string_4);
              ResourceSet _resourceSet = OriginateTwo.res.getResourceSet();
              final Resource r = _resourceSet.getResource(u, true);
              TreeIterator<EObject> _allContents = r.getAllContents();
              Iterator<Model> _filter = Iterators.<Model>filter(_allContents, Model.class);
              final Procedure1<Model> _function_1 = (Model it_1) -> {
                OriginateTwo.CompileModel(it_1);
              };
              IteratorExtensions.<Model>forEach(_filter, _function_1);
              String _headType_2 = it.getHeadType();
              UNode _root = UNode.getRoot();
              m.put(_headType_2, _root);
              UNode _root_1 = UNode.getRoot();
              _root_1.setApart(true);
              UNode.clearUnode();
            }
          }
        }
      };
      ls.forEach(_function);
      _xblockexpression = OriginateTwo.uri = temp;
    }
    return _xblockexpression;
  }
  
  public static void fillList(final String v, final List<UNode> res, final List<UNode> inp) {
    final Function1<UNode, Boolean> _function = (UNode it) -> {
      boolean _isApart = it.isApart();
      return Boolean.valueOf((!_isApart));
    };
    Iterable<UNode> _filter = IterableExtensions.<UNode>filter(inp, _function);
    final Consumer<UNode> _function_1 = (UNode it) -> {
      String _value = it.getValue();
      boolean _equals = v.equals(_value);
      if (_equals) {
        res.add(it);
      }
      List<UNode> _silabs = it.getSilabs();
      OriginateTwo.fillList(v, res, _silabs);
    };
    _filter.forEach(_function_1);
  }
  
  public static void compileAccessory(final List<Accessory> ls) {
    final Consumer<Accessory> _function = (Accessory it) -> {
      String _xtrycatchfinallyexpression = null;
      try {
        InnerText _text = null;
        if (it!=null) {
          _text=it.getText();
        }
        String _value = null;
        if (_text!=null) {
          _value=_text.getValue();
        }
        _xtrycatchfinallyexpression = _value;
      } catch (final Throwable _t) {
        if (_t instanceof NullPointerException) {
          final NullPointerException e = (NullPointerException)_t;
          _xtrycatchfinallyexpression = "";
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      final String content = _xtrycatchfinallyexpression;
      String _xtrycatchfinallyexpression_1 = null;
      try {
        InnerType _type = null;
        if (it!=null) {
          _type=it.getType();
        }
        InnerTypeArray _value_1 = null;
        if (_type!=null) {
          _value_1=_type.getValue();
        }
        _xtrycatchfinallyexpression_1 = OriginateTwo.theStr(_value_1);
      } catch (final Throwable _t_1) {
        if (_t_1 instanceof NullPointerException) {
          final NullPointerException e_1 = (NullPointerException)_t_1;
          _xtrycatchfinallyexpression_1 = "Div";
        } else {
          throw Exceptions.sneakyThrow(_t_1);
        }
      }
      final String type = _xtrycatchfinallyexpression_1;
      String _xtrycatchfinallyexpression_2 = null;
      try {
        InnerClass _clazz = null;
        if (it!=null) {
          _clazz=it.getClazz();
        }
        ClassName _clazzes = null;
        if (_clazz!=null) {
          _clazzes=_clazz.getClazzes();
        }
        String _theId = null;
        if (_clazzes!=null) {
          _theId=_clazzes.getTheId();
        }
        _xtrycatchfinallyexpression_2 = _theId;
      } catch (final Throwable _t_2) {
        if (_t_2 instanceof NullPointerException) {
          final NullPointerException e_2 = (NullPointerException)_t_2;
          _xtrycatchfinallyexpression_2 = "";
        } else {
          throw Exceptions.sneakyThrow(_t_2);
        }
      }
      final String tid = _xtrycatchfinallyexpression_2;
      String _xtrycatchfinallyexpression_3 = null;
      try {
        InnerClass _clazz_1 = null;
        if (it!=null) {
          _clazz_1=it.getClazz();
        }
        ClassName _clazzes_1 = null;
        if (_clazz_1!=null) {
          _clazzes_1=_clazz_1.getClazzes();
        }
        EList<ClassNameSec> _clazz_2 = null;
        if (_clazzes_1!=null) {
          _clazz_2=_clazzes_1.getClazz();
        }
        final Function1<ClassNameSec, String> _function_1 = (ClassNameSec it_1) -> {
          String _cfClazz = null;
          if (it_1!=null) {
            _cfClazz=it_1.getCfClazz();
          }
          return _cfClazz;
        };
        List<String> _map = ListExtensions.<ClassNameSec, String>map(_clazz_2, _function_1);
        _xtrycatchfinallyexpression_3 = IterableExtensions.join(_map, ", ");
      } catch (final Throwable _t_3) {
        if (_t_3 instanceof NullPointerException) {
          final NullPointerException e_3 = (NullPointerException)_t_3;
          _xtrycatchfinallyexpression_3 = "";
        } else {
          throw Exceptions.sneakyThrow(_t_3);
        }
      }
      final String clazz = _xtrycatchfinallyexpression_3;
      String _xtrycatchfinallyexpression_4 = null;
      try {
        InnerFeature _feature = null;
        if (it!=null) {
          _feature=it.getFeature();
        }
        String _value_2 = null;
        if (_feature!=null) {
          _value_2=_feature.getValue();
        }
        _xtrycatchfinallyexpression_4 = _value_2;
      } catch (final Throwable _t_4) {
        if (_t_4 instanceof NullPointerException) {
          final NullPointerException e_4 = (NullPointerException)_t_4;
          _xtrycatchfinallyexpression_4 = "";
        } else {
          throw Exceptions.sneakyThrow(_t_4);
        }
      }
      final String innerF = _xtrycatchfinallyexpression_4;
      final ArrayList<String> sts = new ArrayList<String>();
      InnerStyle _style = null;
      if (it!=null) {
        _style=it.getStyle();
      }
      EList<CssStyle> _styles = null;
      if (_style!=null) {
        _styles=_style.getStyles();
      }
      if (_styles!=null) {
        final Consumer<CssStyle> _function_2 = (CssStyle it_1) -> {
          String _strSytle = CssDefinition.strSytle(it_1);
          sts.add(_strSytle);
        };
        _styles.forEach(_function_2);
      }
      final ArrayList<UNode> list = new ArrayList<UNode>();
      UNode _root = UNode.getRoot();
      String _value_3 = _root.getValue();
      Node _left = it.getLeft();
      char _name = _left.getName();
      String _string = Character.valueOf(_name).toString();
      boolean _equals = _value_3.equals(_string);
      if (_equals) {
        UNode _root_1 = UNode.getRoot();
        list.add(_root_1);
      }
      Node _left_1 = it.getLeft();
      char _name_1 = _left_1.getName();
      String _plus = (Character.valueOf(_name_1) + "");
      UNode _root_2 = UNode.getRoot();
      List<UNode> _silabs = _root_2.getSilabs();
      OriginateTwo.fillList(_plus, list, _silabs);
      int _size = list.size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          UNode m = list.get((i).intValue());
          m.setId(tid);
          m.setContent(content);
          m.setType(type);
          m.setClasses(clazz);
          int _length = 0;
          if (innerF!=null) {
            _length=innerF.length();
          }
          boolean _greaterThan = (_length > 2);
          if (_greaterThan) {
            int _length_1 = innerF.length();
            int _minus = (_length_1 - 1);
            String _substring = innerF.substring(1, _minus);
            m.setFeature(_substring);
          }
          String _join = IterableExtensions.join(sts, " ");
          m.setStyle(_join);
        }
      }
    };
    ls.forEach(_function);
  }
  
  public static String theStr(final InnerTypeArray aa) {
    String _switchResult = null;
    if (aa != null) {
      switch (aa) {
        case DIV:
          _switchResult = "div";
          break;
        case PARA:
          _switchResult = "p";
          break;
        case TABLE:
          _switchResult = "table";
          break;
        case TR:
          _switchResult = "tr";
          break;
        case TD:
          _switchResult = "td";
          break;
        case INPUT:
          _switchResult = "input";
          break;
        case IMG:
          _switchResult = "img";
          break;
        default:
          _switchResult = "Div";
          break;
      }
    } else {
      _switchResult = "Div";
    }
    return _switchResult;
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
      String _string = OriginateTwo.tostring(_name);
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
      String _string = OriginateTwo.tostring(_name);
      _xblockexpression = UNode.addToNode(arr, _string, bs);
    }
    return _xblockexpression;
  }
  
  public static void compileBodies(final List<Body> ls) {
    Body _get = ls.get(0);
    Node _name = _get.getName();
    String _string = OriginateTwo.tostring(_name);
    UNode _uNode = new UNode(_string);
    UNode.setRoot(_uNode);
    final Consumer<Body> _function = (Body it) -> {
      SelfRepeat _selfRepeat = it.getSelfRepeat();
      boolean _equals = Objects.equal(_selfRepeat, null);
      if (_equals) {
        OriginateTwo.makeNode(it);
      } else {
        SelfRepeat _selfRepeat_1 = it.getSelfRepeat();
        boolean _isVertical = _selfRepeat_1.isVertical();
        if (_isVertical) {
          SelfRepeat _selfRepeat_2 = it.getSelfRepeat();
          int _number = _selfRepeat_2.getNumber();
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(1, _number, true);
          for (final Integer i : _doubleDotLessThan) {
            OriginateTwo.makeNode(it, true);
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
          final String left = OriginateTwo.tostring(_name_1);
          SelfRepeat _selfRepeat_3 = it.getSelfRepeat();
          int _number_1 = _selfRepeat_3.getNumber();
          ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(1, _number_1, true);
          for (final Integer i_1 : _doubleDotLessThan_1) {
            Node _name_2 = it.getName();
            String _string_1 = OriginateTwo.tostring(_name_2);
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
  
  public static void setUri(final URI uri) {
    OriginateTwo.uri = uri;
  }
  
  @Pure
  public static Resource getRes() {
    return OriginateTwo.res;
  }
  
  public static void setRes(final Resource res) {
    OriginateTwo.res = res;
  }
  
  @Pure
  public static ArrayList<String> getCssz() {
    return OriginateTwo.cssz;
  }
  
  @Pure
  public static ArrayList<String> getJssz() {
    return OriginateTwo.jssz;
  }
}
