package edu.aut.islab.ghaemi.minuy.generator.model;

import com.google.common.base.Objects;
import edu.aut.islab.ghaemi.minuy.myUiDsl.Aval;
import edu.aut.islab.ghaemi.minuy.myUiDsl.BackColor;
import edu.aut.islab.ghaemi.minuy.myUiDsl.Border;
import edu.aut.islab.ghaemi.minuy.myUiDsl.BorderRad;
import edu.aut.islab.ghaemi.minuy.myUiDsl.Bval;
import edu.aut.islab.ghaemi.minuy.myUiDsl.Clr;
import edu.aut.islab.ghaemi.minuy.myUiDsl.ClrVals;
import edu.aut.islab.ghaemi.minuy.myUiDsl.Color;
import edu.aut.islab.ghaemi.minuy.myUiDsl.Coord;
import edu.aut.islab.ghaemi.minuy.myUiDsl.CssStyle;
import edu.aut.islab.ghaemi.minuy.myUiDsl.Disp;
import edu.aut.islab.ghaemi.minuy.myUiDsl.DispVals;
import edu.aut.islab.ghaemi.minuy.myUiDsl.DownAspect;
import edu.aut.islab.ghaemi.minuy.myUiDsl.Flt;
import edu.aut.islab.ghaemi.minuy.myUiDsl.FltVals;
import edu.aut.islab.ghaemi.minuy.myUiDsl.FourAspect;
import edu.aut.islab.ghaemi.minuy.myUiDsl.Gval;
import edu.aut.islab.ghaemi.minuy.myUiDsl.H8;
import edu.aut.islab.ghaemi.minuy.myUiDsl.LeftAspect;
import edu.aut.islab.ghaemi.minuy.myUiDsl.LiteralColor;
import edu.aut.islab.ghaemi.minuy.myUiDsl.Marg;
import edu.aut.islab.ghaemi.minuy.myUiDsl.MaxVal;
import edu.aut.islab.ghaemi.minuy.myUiDsl.MidVal;
import edu.aut.islab.ghaemi.minuy.myUiDsl.MinMaxValue;
import edu.aut.islab.ghaemi.minuy.myUiDsl.MinVal;
import edu.aut.islab.ghaemi.minuy.myUiDsl.OFlow;
import edu.aut.islab.ghaemi.minuy.myUiDsl.OFlowVals;
import edu.aut.islab.ghaemi.minuy.myUiDsl.Padd;
import edu.aut.islab.ghaemi.minuy.myUiDsl.Pos;
import edu.aut.islab.ghaemi.minuy.myUiDsl.PosVals;
import edu.aut.islab.ghaemi.minuy.myUiDsl.RgbaColor;
import edu.aut.islab.ghaemi.minuy.myUiDsl.RightAspect;
import edu.aut.islab.ghaemi.minuy.myUiDsl.Rval;
import edu.aut.islab.ghaemi.minuy.myUiDsl.UpAspect;
import edu.aut.islab.ghaemi.minuy.myUiDsl.VerAl;
import edu.aut.islab.ghaemi.minuy.myUiDsl.VeralVals;
import edu.aut.islab.ghaemi.minuy.myUiDsl.Wid;
import edu.aut.islab.ghaemi.minuy.myUiDsl.colorDef;

@SuppressWarnings("all")
public class CssDefinition {
  public static String strSytle(final CssStyle c) {
    String _switchResult = null;
    boolean _matched = false;
    if (c instanceof Pos) {
      _matched=true;
      PosVals _value = ((Pos)c).getValue();
      String _string2 = CssDefinition.toString2(_value);
      String _lowerCase = _string2.toLowerCase();
      String _plus = ("position: " + _lowerCase);
      _switchResult = (_plus + "; ");
    }
    if (!_matched) {
      if (c instanceof Clr) {
        _matched=true;
        ClrVals _value = ((Clr)c).getValue();
        String _string2 = CssDefinition.toString2(_value);
        String _lowerCase = _string2.toLowerCase();
        String _plus = ("clear: " + _lowerCase);
        _switchResult = (_plus + "; ");
      }
    }
    if (!_matched) {
      if (c instanceof Flt) {
        _matched=true;
        FltVals _value = ((Flt)c).getValue();
        String _string2 = CssDefinition.toString2(_value);
        String _lowerCase = _string2.toLowerCase();
        String _plus = ("float: " + _lowerCase);
        _switchResult = (_plus + "; ");
      }
    }
    if (!_matched) {
      if (c instanceof Disp) {
        _matched=true;
        DispVals _value = ((Disp)c).getValue();
        String _string2 = CssDefinition.toString2(_value);
        String _lowerCase = _string2.toLowerCase();
        String _plus = ("display: " + _lowerCase);
        _switchResult = (_plus + "; ");
      }
    }
    if (!_matched) {
      if (c instanceof VerAl) {
        _matched=true;
        VeralVals _value = ((VerAl)c).getValue();
        String _string2 = CssDefinition.toString2(_value);
        String _lowerCase = _string2.toLowerCase();
        String _plus = ("vertical-align: " + _lowerCase);
        _switchResult = (_plus + "; ");
      }
    }
    if (!_matched) {
      if (c instanceof Wid) {
        _matched=true;
        _switchResult = CssDefinition.makeWid(((Wid)c));
      }
    }
    if (!_matched) {
      if (c instanceof H8) {
        _matched=true;
        _switchResult = CssDefinition.makeH8(((H8)c));
      }
    }
    if (!_matched) {
      if (c instanceof Coord) {
        _matched=true;
        _switchResult = CssDefinition.makeCoord(((Coord)c));
      }
    }
    if (!_matched) {
      if (c instanceof OFlow) {
        _matched=true;
        OFlowVals _value = ((OFlow)c).getValue();
        String _string2 = CssDefinition.toString2(_value);
        String _lowerCase = _string2.toLowerCase();
        String _plus = ("overflow: " + _lowerCase);
        _switchResult = (_plus + "; ");
      }
    }
    if (!_matched) {
      if (c instanceof Marg) {
        _matched=true;
        _switchResult = CssDefinition.makeMargin(((Marg)c));
      }
    }
    if (!_matched) {
      if (c instanceof Padd) {
        _matched=true;
        _switchResult = CssDefinition.makePadding(((Padd)c));
      }
    }
    if (!_matched) {
      if (c instanceof Border) {
        _matched=true;
        colorDef _value = ((Border)c).getValue();
        String _theColor = CssDefinition.theColor(_value);
        String _plus = ("border: 1px solid " + _theColor);
        _switchResult = (_plus + " ; ");
      }
    }
    if (!_matched) {
      if (c instanceof BorderRad) {
        _matched=true;
        int _value = ((BorderRad)c).getValue();
        String _plus = ("border-radius: " + Integer.valueOf(_value));
        String _elvis = null;
        String _measureType = ((BorderRad)c).getMeasureType();
        if (_measureType != null) {
          _elvis = _measureType;
        } else {
          _elvis = "px";
        }
        String _plus_1 = (_plus + _elvis);
        _switchResult = (_plus_1 + " ;");
      }
    }
    if (!_matched) {
      if (c instanceof BackColor) {
        _matched=true;
        colorDef _value = ((BackColor)c).getValue();
        String _theColor = CssDefinition.theColor(_value);
        String _plus = ("background-color:  " + _theColor);
        _switchResult = (_plus + " ; ");
      }
    }
    if (!_matched) {
      if (c instanceof Color) {
        _matched=true;
        colorDef _value = ((Color)c).getValue();
        String _theColor = CssDefinition.theColor(_value);
        String _plus = ("color:  " + _theColor);
        _switchResult = (_plus + " ; ");
      }
    }
    return _switchResult;
  }
  
  /**
   * try{(d.rval.value%255).toString}catch(NullPointerException e){"255"} + "," +
   * try{(d.gval.value%255).toString}catch(NullPointerException e){"255"} + "," +
   * try{(d.bval.value%255).toString}catch(NullPointerException eee){"255"} + "," +
   * try{((d.aval.value%100)/100).toString}catch(NullPointerException eeee){"1"}
   */
  public static String colorValue(final Object o) {
    Object _switchResult = null;
    boolean _matched = false;
    if (o instanceof Rval) {
      _matched=true;
      int _value = ((Rval)o).getValue();
      _switchResult = Integer.valueOf((_value % 255));
    }
    if (!_matched) {
      if (o instanceof Gval) {
        _matched=true;
        int _value = ((Gval)o).getValue();
        _switchResult = Integer.valueOf((_value % 255));
      }
    }
    if (!_matched) {
      if (o instanceof Bval) {
        _matched=true;
        int _value = ((Bval)o).getValue();
        _switchResult = Integer.valueOf((_value % 255));
      }
    }
    if (!_matched) {
      if (o instanceof Aval) {
        _matched=true;
        int _value = ((Aval)o).getValue();
        int _modulo = (_value % 100);
        _switchResult = Double.valueOf((_modulo / 100.0));
      }
    }
    if (!_matched) {
      _switchResult = "255";
    }
    return (_switchResult + "");
  }
  
  public static String theColor(final colorDef d) {
    String _switchResult = null;
    boolean _matched = false;
    if (d instanceof LiteralColor) {
      _matched=true;
      String _value = ((LiteralColor)d).getValue();
      _switchResult = _value.toLowerCase();
    }
    if (!_matched) {
      if (d instanceof RgbaColor) {
        _matched=true;
        Rval _rval = ((RgbaColor)d).getRval();
        String _colorValue = CssDefinition.colorValue(_rval);
        String _plus = ("rgba(" + _colorValue);
        String _plus_1 = (_plus + ",");
        Gval _gval = ((RgbaColor)d).getGval();
        String _colorValue_1 = CssDefinition.colorValue(_gval);
        String _plus_2 = (_plus_1 + _colorValue_1);
        String _plus_3 = (_plus_2 + ",");
        Bval _bval = ((RgbaColor)d).getBval();
        String _colorValue_2 = CssDefinition.colorValue(_bval);
        String _plus_4 = (_plus_3 + _colorValue_2);
        String _plus_5 = (_plus_4 + ",");
        Aval _aval = ((RgbaColor)d).getAval();
        String _colorValue_3 = CssDefinition.colorValue(_aval);
        String _plus_6 = (_plus_5 + _colorValue_3);
        _switchResult = (_plus_6 + ")");
      }
    }
    return _switchResult;
  }
  
  public static String makeWid(final Wid w) {
    String _xblockexpression = null;
    {
      String str = "";
      MinMaxValue _value = w.getValue();
      MinVal _minVal = _value.getMinVal();
      boolean _notEquals = (!Objects.equal(_minVal, null));
      if (_notEquals) {
        String _str = str;
        MinMaxValue _value_1 = w.getValue();
        MinVal _minVal_1 = _value_1.getMinVal();
        int _value_2 = _minVal_1.getValue();
        String _plus = ("min-width: " + Integer.valueOf(_value_2));
        String _elvis = null;
        MinMaxValue _value_3 = w.getValue();
        MinVal _minVal_2 = _value_3.getMinVal();
        String _measureType = _minVal_2.getMeasureType();
        if (_measureType != null) {
          _elvis = _measureType;
        } else {
          _elvis = "px";
        }
        String _plus_1 = (_plus + _elvis);
        String _plus_2 = (_plus_1 + " ; ");
        str = (_str + _plus_2);
      }
      MinMaxValue _value_4 = w.getValue();
      MidVal _midVal = _value_4.getMidVal();
      boolean _notEquals_1 = (!Objects.equal(_midVal, null));
      if (_notEquals_1) {
        String _str_1 = str;
        MinMaxValue _value_5 = w.getValue();
        MidVal _midVal_1 = _value_5.getMidVal();
        int _value_6 = _midVal_1.getValue();
        String _plus_3 = ("width: " + Integer.valueOf(_value_6));
        String _elvis_1 = null;
        MinMaxValue _value_7 = w.getValue();
        MidVal _midVal_2 = _value_7.getMidVal();
        String _measureType_1 = _midVal_2.getMeasureType();
        if (_measureType_1 != null) {
          _elvis_1 = _measureType_1;
        } else {
          _elvis_1 = "px";
        }
        String _plus_4 = (_plus_3 + _elvis_1);
        String _plus_5 = (_plus_4 + " ; ");
        str = (_str_1 + _plus_5);
      }
      MinMaxValue _value_8 = w.getValue();
      MaxVal _maxVal = _value_8.getMaxVal();
      boolean _notEquals_2 = (!Objects.equal(_maxVal, null));
      if (_notEquals_2) {
        String _str_2 = str;
        MinMaxValue _value_9 = w.getValue();
        MaxVal _maxVal_1 = _value_9.getMaxVal();
        int _value_10 = _maxVal_1.getValue();
        String _plus_6 = ("max-width: " + Integer.valueOf(_value_10));
        String _elvis_2 = null;
        MinMaxValue _value_11 = w.getValue();
        MaxVal _maxVal_2 = _value_11.getMaxVal();
        String _measureType_2 = _maxVal_2.getMeasureType();
        if (_measureType_2 != null) {
          _elvis_2 = _measureType_2;
        } else {
          _elvis_2 = "px";
        }
        String _plus_7 = (_plus_6 + _elvis_2);
        String _plus_8 = (_plus_7 + " ; ");
        str = (_str_2 + _plus_8);
      }
      _xblockexpression = str;
    }
    return _xblockexpression;
  }
  
  public static String makeCoord(final Coord w) {
    String _xblockexpression = null;
    {
      String str = "";
      FourAspect _value = w.getValue();
      UpAspect _up = _value.getUp();
      boolean _notEquals = (!Objects.equal(_up, null));
      if (_notEquals) {
        String _str = str;
        FourAspect _value_1 = w.getValue();
        UpAspect _up_1 = _value_1.getUp();
        int _value_2 = _up_1.getValue();
        String _plus = ("up: " + Integer.valueOf(_value_2));
        String _elvis = null;
        FourAspect _value_3 = w.getValue();
        UpAspect _up_2 = _value_3.getUp();
        String _measureType = _up_2.getMeasureType();
        if (_measureType != null) {
          _elvis = _measureType;
        } else {
          _elvis = "px";
        }
        String _plus_1 = (_plus + _elvis);
        String _plus_2 = (_plus_1 + " ; ");
        str = (_str + _plus_2);
      }
      FourAspect _value_4 = w.getValue();
      DownAspect _down = _value_4.getDown();
      boolean _notEquals_1 = (!Objects.equal(_down, null));
      if (_notEquals_1) {
        String _str_1 = str;
        FourAspect _value_5 = w.getValue();
        DownAspect _down_1 = _value_5.getDown();
        int _value_6 = _down_1.getValue();
        String _plus_3 = ("down: " + Integer.valueOf(_value_6));
        String _elvis_1 = null;
        FourAspect _value_7 = w.getValue();
        DownAspect _down_2 = _value_7.getDown();
        String _measureType_1 = _down_2.getMeasureType();
        if (_measureType_1 != null) {
          _elvis_1 = _measureType_1;
        } else {
          _elvis_1 = "px";
        }
        String _plus_4 = (_plus_3 + _elvis_1);
        String _plus_5 = (_plus_4 + " ; ");
        str = (_str_1 + _plus_5);
      }
      FourAspect _value_8 = w.getValue();
      LeftAspect _left = _value_8.getLeft();
      boolean _notEquals_2 = (!Objects.equal(_left, null));
      if (_notEquals_2) {
        String _str_2 = str;
        FourAspect _value_9 = w.getValue();
        LeftAspect _left_1 = _value_9.getLeft();
        int _value_10 = _left_1.getValue();
        String _plus_6 = ("left: " + Integer.valueOf(_value_10));
        String _elvis_2 = null;
        FourAspect _value_11 = w.getValue();
        LeftAspect _left_2 = _value_11.getLeft();
        String _measureType_2 = _left_2.getMeasureType();
        if (_measureType_2 != null) {
          _elvis_2 = _measureType_2;
        } else {
          _elvis_2 = "px";
        }
        String _plus_7 = (_plus_6 + _elvis_2);
        String _plus_8 = (_plus_7 + " ; ");
        str = (_str_2 + _plus_8);
      }
      FourAspect _value_12 = w.getValue();
      RightAspect _right = _value_12.getRight();
      boolean _notEquals_3 = (!Objects.equal(_right, null));
      if (_notEquals_3) {
        String _str_3 = str;
        FourAspect _value_13 = w.getValue();
        RightAspect _right_1 = _value_13.getRight();
        int _value_14 = _right_1.getValue();
        String _plus_9 = ("right: " + Integer.valueOf(_value_14));
        String _elvis_3 = null;
        FourAspect _value_15 = w.getValue();
        RightAspect _right_2 = _value_15.getRight();
        String _measureType_3 = _right_2.getMeasureType();
        if (_measureType_3 != null) {
          _elvis_3 = _measureType_3;
        } else {
          _elvis_3 = "px";
        }
        String _plus_10 = (_plus_9 + _elvis_3);
        String _plus_11 = (_plus_10 + " ; ");
        str = (_str_3 + _plus_11);
      }
      _xblockexpression = str;
    }
    return _xblockexpression;
  }
  
  public static String makeMargin(final Marg w) {
    String _xblockexpression = null;
    {
      String str = "";
      FourAspect _value = w.getValue();
      UpAspect _up = _value.getUp();
      boolean _notEquals = (!Objects.equal(_up, null));
      if (_notEquals) {
        String _str = str;
        FourAspect _value_1 = w.getValue();
        UpAspect _up_1 = _value_1.getUp();
        int _value_2 = _up_1.getValue();
        String _plus = ("margin-top: " + Integer.valueOf(_value_2));
        String _elvis = null;
        FourAspect _value_3 = w.getValue();
        UpAspect _up_2 = _value_3.getUp();
        String _measureType = _up_2.getMeasureType();
        if (_measureType != null) {
          _elvis = _measureType;
        } else {
          _elvis = "px";
        }
        String _plus_1 = (_plus + _elvis);
        String _plus_2 = (_plus_1 + " ; ");
        str = (_str + _plus_2);
      }
      FourAspect _value_4 = w.getValue();
      DownAspect _down = _value_4.getDown();
      boolean _notEquals_1 = (!Objects.equal(_down, null));
      if (_notEquals_1) {
        String _str_1 = str;
        FourAspect _value_5 = w.getValue();
        DownAspect _down_1 = _value_5.getDown();
        int _value_6 = _down_1.getValue();
        String _plus_3 = ("margin-bottom: " + Integer.valueOf(_value_6));
        String _elvis_1 = null;
        FourAspect _value_7 = w.getValue();
        DownAspect _down_2 = _value_7.getDown();
        String _measureType_1 = _down_2.getMeasureType();
        if (_measureType_1 != null) {
          _elvis_1 = _measureType_1;
        } else {
          _elvis_1 = "px";
        }
        String _plus_4 = (_plus_3 + _elvis_1);
        String _plus_5 = (_plus_4 + " ; ");
        str = (_str_1 + _plus_5);
      }
      FourAspect _value_8 = w.getValue();
      LeftAspect _left = _value_8.getLeft();
      boolean _notEquals_2 = (!Objects.equal(_left, null));
      if (_notEquals_2) {
        String _str_2 = str;
        FourAspect _value_9 = w.getValue();
        LeftAspect _left_1 = _value_9.getLeft();
        int _value_10 = _left_1.getValue();
        String _plus_6 = ("margin-left: " + Integer.valueOf(_value_10));
        String _elvis_2 = null;
        FourAspect _value_11 = w.getValue();
        LeftAspect _left_2 = _value_11.getLeft();
        String _measureType_2 = _left_2.getMeasureType();
        if (_measureType_2 != null) {
          _elvis_2 = _measureType_2;
        } else {
          _elvis_2 = "px";
        }
        String _plus_7 = (_plus_6 + _elvis_2);
        String _plus_8 = (_plus_7 + " ; ");
        str = (_str_2 + _plus_8);
      }
      FourAspect _value_12 = w.getValue();
      RightAspect _right = _value_12.getRight();
      boolean _notEquals_3 = (!Objects.equal(_right, null));
      if (_notEquals_3) {
        String _str_3 = str;
        FourAspect _value_13 = w.getValue();
        RightAspect _right_1 = _value_13.getRight();
        int _value_14 = _right_1.getValue();
        String _plus_9 = ("margin-right: " + Integer.valueOf(_value_14));
        String _elvis_3 = null;
        FourAspect _value_15 = w.getValue();
        RightAspect _right_2 = _value_15.getRight();
        String _measureType_3 = _right_2.getMeasureType();
        if (_measureType_3 != null) {
          _elvis_3 = _measureType_3;
        } else {
          _elvis_3 = "px";
        }
        String _plus_10 = (_plus_9 + _elvis_3);
        String _plus_11 = (_plus_10 + " ; ");
        str = (_str_3 + _plus_11);
      }
      _xblockexpression = str;
    }
    return _xblockexpression;
  }
  
  public static String makePadding(final Padd w) {
    String _xblockexpression = null;
    {
      String str = "";
      FourAspect _value = w.getValue();
      UpAspect _up = _value.getUp();
      boolean _notEquals = (!Objects.equal(_up, null));
      if (_notEquals) {
        String _str = str;
        FourAspect _value_1 = w.getValue();
        UpAspect _up_1 = _value_1.getUp();
        int _value_2 = _up_1.getValue();
        String _plus = ("padding -top: " + Integer.valueOf(_value_2));
        String _elvis = null;
        FourAspect _value_3 = w.getValue();
        UpAspect _up_2 = _value_3.getUp();
        String _measureType = _up_2.getMeasureType();
        if (_measureType != null) {
          _elvis = _measureType;
        } else {
          _elvis = "px";
        }
        String _plus_1 = (_plus + _elvis);
        String _plus_2 = (_plus_1 + " ; ");
        str = (_str + _plus_2);
      }
      FourAspect _value_4 = w.getValue();
      DownAspect _down = _value_4.getDown();
      boolean _notEquals_1 = (!Objects.equal(_down, null));
      if (_notEquals_1) {
        String _str_1 = str;
        FourAspect _value_5 = w.getValue();
        DownAspect _down_1 = _value_5.getDown();
        int _value_6 = _down_1.getValue();
        String _plus_3 = ("padding -bottom: " + Integer.valueOf(_value_6));
        String _elvis_1 = null;
        FourAspect _value_7 = w.getValue();
        DownAspect _down_2 = _value_7.getDown();
        String _measureType_1 = _down_2.getMeasureType();
        if (_measureType_1 != null) {
          _elvis_1 = _measureType_1;
        } else {
          _elvis_1 = "px";
        }
        String _plus_4 = (_plus_3 + _elvis_1);
        String _plus_5 = (_plus_4 + " ; ");
        str = (_str_1 + _plus_5);
      }
      FourAspect _value_8 = w.getValue();
      LeftAspect _left = _value_8.getLeft();
      boolean _notEquals_2 = (!Objects.equal(_left, null));
      if (_notEquals_2) {
        String _str_2 = str;
        FourAspect _value_9 = w.getValue();
        LeftAspect _left_1 = _value_9.getLeft();
        int _value_10 = _left_1.getValue();
        String _plus_6 = ("padding -left: " + Integer.valueOf(_value_10));
        String _elvis_2 = null;
        FourAspect _value_11 = w.getValue();
        LeftAspect _left_2 = _value_11.getLeft();
        String _measureType_2 = _left_2.getMeasureType();
        if (_measureType_2 != null) {
          _elvis_2 = _measureType_2;
        } else {
          _elvis_2 = "px";
        }
        String _plus_7 = (_plus_6 + _elvis_2);
        String _plus_8 = (_plus_7 + " ; ");
        str = (_str_2 + _plus_8);
      }
      FourAspect _value_12 = w.getValue();
      RightAspect _right = _value_12.getRight();
      boolean _notEquals_3 = (!Objects.equal(_right, null));
      if (_notEquals_3) {
        String _str_3 = str;
        FourAspect _value_13 = w.getValue();
        RightAspect _right_1 = _value_13.getRight();
        int _value_14 = _right_1.getValue();
        String _plus_9 = ("padding -right: " + Integer.valueOf(_value_14));
        String _elvis_3 = null;
        FourAspect _value_15 = w.getValue();
        RightAspect _right_2 = _value_15.getRight();
        String _measureType_3 = _right_2.getMeasureType();
        if (_measureType_3 != null) {
          _elvis_3 = _measureType_3;
        } else {
          _elvis_3 = "px";
        }
        String _plus_10 = (_plus_9 + _elvis_3);
        String _plus_11 = (_plus_10 + " ; ");
        str = (_str_3 + _plus_11);
      }
      _xblockexpression = str;
    }
    return _xblockexpression;
  }
  
  public static String makeH8(final H8 w) {
    String _xblockexpression = null;
    {
      String str = "";
      MinMaxValue _value = w.getValue();
      MinVal _minVal = _value.getMinVal();
      boolean _notEquals = (!Objects.equal(_minVal, null));
      if (_notEquals) {
        String _str = str;
        MinMaxValue _value_1 = w.getValue();
        MinVal _minVal_1 = _value_1.getMinVal();
        int _value_2 = _minVal_1.getValue();
        String _plus = ("min-height: " + Integer.valueOf(_value_2));
        String _elvis = null;
        MinMaxValue _value_3 = w.getValue();
        MinVal _minVal_2 = _value_3.getMinVal();
        String _measureType = _minVal_2.getMeasureType();
        if (_measureType != null) {
          _elvis = _measureType;
        } else {
          _elvis = "px";
        }
        String _plus_1 = (_plus + _elvis);
        String _plus_2 = (_plus_1 + " ; ");
        str = (_str + _plus_2);
      }
      MinMaxValue _value_4 = w.getValue();
      MidVal _midVal = _value_4.getMidVal();
      boolean _notEquals_1 = (!Objects.equal(_midVal, null));
      if (_notEquals_1) {
        String _str_1 = str;
        MinMaxValue _value_5 = w.getValue();
        MidVal _midVal_1 = _value_5.getMidVal();
        int _value_6 = _midVal_1.getValue();
        String _plus_3 = ("height: " + Integer.valueOf(_value_6));
        String _elvis_1 = null;
        MinMaxValue _value_7 = w.getValue();
        MidVal _midVal_2 = _value_7.getMidVal();
        String _measureType_1 = _midVal_2.getMeasureType();
        if (_measureType_1 != null) {
          _elvis_1 = _measureType_1;
        } else {
          _elvis_1 = "px";
        }
        String _plus_4 = (_plus_3 + _elvis_1);
        String _plus_5 = (_plus_4 + " ; ");
        str = (_str_1 + _plus_5);
      }
      MinMaxValue _value_8 = w.getValue();
      MaxVal _maxVal = _value_8.getMaxVal();
      boolean _notEquals_2 = (!Objects.equal(_maxVal, null));
      if (_notEquals_2) {
        String _str_2 = str;
        MinMaxValue _value_9 = w.getValue();
        MaxVal _maxVal_1 = _value_9.getMaxVal();
        int _value_10 = _maxVal_1.getValue();
        String _plus_6 = ("max-height: " + Integer.valueOf(_value_10));
        String _elvis_2 = null;
        MinMaxValue _value_11 = w.getValue();
        MaxVal _maxVal_2 = _value_11.getMaxVal();
        String _measureType_2 = _maxVal_2.getMeasureType();
        if (_measureType_2 != null) {
          _elvis_2 = _measureType_2;
        } else {
          _elvis_2 = "px";
        }
        String _plus_7 = (_plus_6 + _elvis_2);
        String _plus_8 = (_plus_7 + " ; ");
        str = (_str_2 + _plus_8);
      }
      _xblockexpression = str;
    }
    return _xblockexpression;
  }
  
  public static String toString2(final PosVals p) {
    String _switchResult = null;
    if (p != null) {
      switch (p) {
        case ABSOLUTE:
          _switchResult = "absolute";
          break;
        case FIXED:
          _switchResult = "fixed";
          break;
        case RELATIVE:
          _switchResult = "relative";
          break;
        case STEAKY:
          _switchResult = "steaky";
          break;
        case STATIC:
          _switchResult = "static";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  public static String toString2(final OFlowVals p) {
    String _switchResult = null;
    if (p != null) {
      switch (p) {
        case AUTO:
          _switchResult = "auto";
          break;
        case HIDDEN:
          _switchResult = "hidden";
          break;
        case SCROLL:
          _switchResult = "scroll";
          break;
        case VISIBLE:
          _switchResult = "visible";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  public static String toString2(final FltVals p) {
    String _switchResult = null;
    if (p != null) {
      switch (p) {
        case LEFT:
          _switchResult = "left";
          break;
        case RIGHT:
          _switchResult = "right";
          break;
        case START:
          _switchResult = "start";
          break;
        case END:
          _switchResult = "end";
          break;
        case NONE:
          _switchResult = "none";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  public static String toString2(final ClrVals p) {
    String _switchResult = null;
    if (p != null) {
      switch (p) {
        case LEFT:
          _switchResult = "left";
          break;
        case RIGHT:
          _switchResult = "right";
          break;
        case BOTH:
          _switchResult = "both";
          break;
        case NONE:
          _switchResult = "none";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  public static String toString2(final DispVals p) {
    String _switchResult = null;
    if (p != null) {
      switch (p) {
        case BLOCK:
          _switchResult = "block";
          break;
        case IN_BL:
          _switchResult = "inline-block";
          break;
        case INLINE:
          _switchResult = "inline";
          break;
        case TABLE:
          _switchResult = "table";
          break;
        case NONE:
          _switchResult = "none";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  public static String toString2(final VeralVals p) {
    String _switchResult = null;
    if (p != null) {
      switch (p) {
        case TOP:
          _switchResult = "top";
          break;
        case CENTER:
          _switchResult = "middle";
          break;
        case DOWN:
          _switchResult = "bottom";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
}
