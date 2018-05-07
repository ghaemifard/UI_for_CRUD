package edu.aut.islab.ghaemi.minuy.generator.model;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class UNode {
  @Accessors({ AccessorType.PUBLIC_SETTER, AccessorType.PUBLIC_GETTER })
  private static UNode root = null;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private List<UNode> silabs = new ArrayList<UNode>();
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private final static List<UNode> leafs = new ArrayList<UNode>();
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private String value = null;
  
  @Accessors({ AccessorType.PUBLIC_SETTER, AccessorType.PUBLIC_GETTER })
  private String id = null;
  
  @Accessors({ AccessorType.PUBLIC_SETTER, AccessorType.PUBLIC_GETTER })
  private String content = null;
  
  @Accessors({ AccessorType.PUBLIC_SETTER, AccessorType.PUBLIC_GETTER })
  private String classes = null;
  
  @Accessors({ AccessorType.PUBLIC_SETTER, AccessorType.PUBLIC_GETTER })
  private String type = "DIV";
  
  @Accessors({ AccessorType.PUBLIC_SETTER, AccessorType.PUBLIC_GETTER })
  private String feature = null;
  
  @Accessors({ AccessorType.PUBLIC_SETTER, AccessorType.PUBLIC_GETTER })
  private String style = null;
  
  @Accessors({ AccessorType.PUBLIC_SETTER, AccessorType.PUBLIC_GETTER })
  private boolean apart = false;
  
  public static void clearUnode() {
    UNode.root = null;
    UNode.leafs.clear();
  }
  
  public static boolean addToNode(final List<UNode> ls, final String tar) {
    boolean _xblockexpression = false;
    {
      final ArrayList<UNode> list = new ArrayList<UNode>();
      final Function1<UNode, Boolean> _function = (UNode it) -> {
        return Boolean.valueOf(Objects.equal(it.value, tar));
      };
      Iterable<UNode> _filter = IterableExtensions.<UNode>filter(UNode.leafs, _function);
      final Consumer<UNode> _function_1 = (UNode it) -> {
        it.silabs.addAll(ls);
        list.add(it);
      };
      _filter.forEach(_function_1);
      _xblockexpression = UNode.leafs.removeAll(list);
    }
    return _xblockexpression;
  }
  
  public UNode(final String v) {
    this.value = v;
    UNode.leafs.add(this);
  }
  
  public static boolean addToNode(final List<UNode> ls, final String tar, final boolean s) {
    boolean _xblockexpression = false;
    {
      final ArrayList<UNode> list = new ArrayList<UNode>();
      final Function1<UNode, Boolean> _function = (UNode it) -> {
        return Boolean.valueOf(Objects.equal(it.value, tar));
      };
      Iterable<UNode> _filter = IterableExtensions.<UNode>filter(UNode.leafs, _function);
      final Consumer<UNode> _function_1 = (UNode it) -> {
        it.silabs.addAll(ls);
        list.add(it);
      };
      _filter.forEach(_function_1);
      UNode.leafs.removeAll(list);
      _xblockexpression = UNode.leafs.addAll(ls);
    }
    return _xblockexpression;
  }
  
  public UNode(final String v, final boolean s) {
    this.value = v;
  }
  
  public String rehsteh() {
    final Function1<UNode, String> _function = (UNode it) -> {
      return it.rehsteh();
    };
    List<String> _map = ListExtensions.<UNode, String>map(this.silabs, _function);
    String _join = IterableExtensions.join(_map, ",");
    String _plus = ((this.value + "{\r\n\t") + _join);
    return (_plus + 
      "\r\n}");
  }
  
  @Pure
  public static UNode getRoot() {
    return UNode.root;
  }
  
  public static void setRoot(final UNode root) {
    UNode.root = root;
  }
  
  @Pure
  public List<UNode> getSilabs() {
    return this.silabs;
  }
  
  @Pure
  public static List<UNode> getLeafs() {
    return UNode.leafs;
  }
  
  @Pure
  public String getValue() {
    return this.value;
  }
  
  @Pure
  public String getId() {
    return this.id;
  }
  
  public void setId(final String id) {
    this.id = id;
  }
  
  @Pure
  public String getContent() {
    return this.content;
  }
  
  public void setContent(final String content) {
    this.content = content;
  }
  
  @Pure
  public String getClasses() {
    return this.classes;
  }
  
  public void setClasses(final String classes) {
    this.classes = classes;
  }
  
  @Pure
  public String getType() {
    return this.type;
  }
  
  public void setType(final String type) {
    this.type = type;
  }
  
  @Pure
  public String getFeature() {
    return this.feature;
  }
  
  public void setFeature(final String feature) {
    this.feature = feature;
  }
  
  @Pure
  public String getStyle() {
    return this.style;
  }
  
  public void setStyle(final String style) {
    this.style = style;
  }
  
  @Pure
  public boolean isApart() {
    return this.apart;
  }
  
  public void setApart(final boolean apart) {
    this.apart = apart;
  }
}
