
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Mar 19 16:38:34 EDT 2014
//----------------------------------------------------

import java.util.ArrayList;
import java_cup.runtime.Symbol;
import java.util.Hashtable;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Mar 19 16:38:34 EDT 2014
  */
public class BestParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public BestParser() {super();}

  /** Constructor which sets the default scanner. */
  public BestParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public BestParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\023\000\002\002\004\000\002\002\004\000\002\002" +
    "\002\000\002\003\003\000\002\003\004\000\002\004\003" +
    "\000\002\004\010\000\002\004\010\000\002\004\010\000" +
    "\002\004\010\000\002\004\010\000\002\004\006\000\002" +
    "\004\004\000\002\004\003\000\002\004\004\000\002\004" +
    "\010\000\002\004\011\000\002\004\011\000\002\004\003" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\104\000\042\002\uffff\004\uffff\005\uffff\006\uffff\007" +
    "\uffff\010\uffff\012\uffff\013\uffff\014\uffff\015\uffff\016\uffff" +
    "\017\uffff\020\uffff\023\uffff\025\uffff\026\uffff\001\002\000" +
    "\042\002\017\004\020\005\013\006\024\007\026\010\022" +
    "\012\012\013\005\014\021\015\016\016\011\017\023\020" +
    "\015\023\025\025\007\026\010\001\002\000\004\025\106" +
    "\001\002\000\042\002\ufffe\004\ufffe\005\ufffe\006\ufffe\007" +
    "\ufffe\010\ufffe\012\ufffe\013\ufffe\014\ufffe\015\ufffe\016\ufffe" +
    "\017\ufffe\020\ufffe\023\ufffe\025\ufffe\026\ufffe\001\002\000" +
    "\042\002\uffef\004\uffef\005\uffef\006\uffef\007\uffef\010\uffef" +
    "\012\uffef\013\uffef\014\uffef\015\uffef\016\uffef\017\uffef\020" +
    "\uffef\023\uffef\025\uffef\026\uffef\001\002\000\042\002\ufffc" +
    "\004\ufffc\005\ufffc\006\ufffc\007\ufffc\010\ufffc\012\ufffc\013" +
    "\ufffc\014\ufffc\015\ufffc\016\ufffc\017\ufffc\020\ufffc\023\ufffc" +
    "\025\ufffc\026\ufffc\001\002\000\004\025\101\001\002\000" +
    "\004\025\076\001\002\000\004\025\071\001\002\000\042" +
    "\002\000\004\000\005\000\006\000\007\000\010\000\012" +
    "\000\013\000\014\000\015\000\016\000\017\000\020\000" +
    "\023\000\025\000\026\000\001\002\000\004\025\063\001" +
    "\002\000\004\024\062\001\002\000\004\002\001\001\002" +
    "\000\004\025\055\001\002\000\042\002\ufff4\004\ufff4\005" +
    "\ufff4\006\ufff4\007\ufff4\010\ufff4\012\ufff4\013\ufff4\014\ufff4" +
    "\015\ufff4\016\ufff4\017\ufff4\020\ufff4\023\ufff4\025\ufff4\026" +
    "\ufff4\001\002\000\004\025\050\001\002\000\004\025\042" +
    "\001\002\000\004\025\035\001\002\000\036\004\020\005" +
    "\013\006\024\007\026\010\022\012\012\013\005\014\021" +
    "\015\016\016\011\017\023\020\015\025\007\026\010\001" +
    "\002\000\004\025\027\001\002\000\004\011\030\001\002" +
    "\000\004\025\031\001\002\000\004\011\032\001\002\000" +
    "\004\025\033\001\002\000\042\002\ufff8\004\ufff8\005\ufff8" +
    "\006\ufff8\007\ufff8\010\ufff8\012\ufff8\013\ufff8\014\ufff8\015" +
    "\ufff8\016\ufff8\017\ufff8\020\ufff8\023\ufff8\025\ufff8\026\ufff8" +
    "\001\002\000\042\002\ufffd\004\ufffd\005\ufffd\006\ufffd\007" +
    "\ufffd\010\ufffd\012\ufffd\013\ufffd\014\ufffd\015\ufffd\016\ufffd" +
    "\017\ufffd\020\ufffd\023\ufffd\025\ufffd\026\ufffd\001\002\000" +
    "\004\011\036\001\002\000\004\025\037\001\002\000\004" +
    "\011\040\001\002\000\004\026\041\001\002\000\042\002" +
    "\ufff9\004\ufff9\005\ufff9\006\ufff9\007\ufff9\010\ufff9\012\ufff9" +
    "\013\ufff9\014\ufff9\015\ufff9\016\ufff9\017\ufff9\020\ufff9\023" +
    "\ufff9\025\ufff9\026\ufff9\001\002\000\004\011\043\001\002" +
    "\000\004\026\044\001\002\000\004\021\045\001\002\000" +
    "\004\025\046\001\002\000\004\022\047\001\002\000\042" +
    "\002\ufff1\004\ufff1\005\ufff1\006\ufff1\007\ufff1\010\ufff1\012" +
    "\ufff1\013\ufff1\014\ufff1\015\ufff1\016\ufff1\017\ufff1\020\ufff1" +
    "\023\ufff1\025\ufff1\026\ufff1\001\002\000\004\011\051\001" +
    "\002\000\004\025\052\001\002\000\004\011\053\001\002" +
    "\000\004\025\054\001\002\000\042\002\ufff7\004\ufff7\005" +
    "\ufff7\006\ufff7\007\ufff7\010\ufff7\012\ufff7\013\ufff7\014\ufff7" +
    "\015\ufff7\016\ufff7\017\ufff7\020\ufff7\023\ufff7\025\ufff7\026" +
    "\ufff7\001\002\000\004\011\056\001\002\000\004\025\057" +
    "\001\002\000\004\011\060\001\002\000\004\025\061\001" +
    "\002\000\042\002\ufffb\004\ufffb\005\ufffb\006\ufffb\007\ufffb" +
    "\010\ufffb\012\ufffb\013\ufffb\014\ufffb\015\ufffb\016\ufffb\017" +
    "\ufffb\020\ufffb\023\ufffb\025\ufffb\026\ufffb\001\002\000\042" +
    "\002\ufff3\004\ufff3\005\ufff3\006\ufff3\007\ufff3\010\ufff3\012" +
    "\ufff3\013\ufff3\014\ufff3\015\ufff3\016\ufff3\017\ufff3\020\ufff3" +
    "\023\ufff3\025\ufff3\026\ufff3\001\002\000\004\011\064\001" +
    "\002\000\004\026\065\001\002\000\004\021\066\001\002" +
    "\000\004\025\067\001\002\000\004\022\070\001\002\000" +
    "\042\002\ufff0\004\ufff0\005\ufff0\006\ufff0\007\ufff0\010\ufff0" +
    "\012\ufff0\013\ufff0\014\ufff0\015\ufff0\016\ufff0\017\ufff0\020" +
    "\ufff0\023\ufff0\025\ufff0\026\ufff0\001\002\000\004\011\072" +
    "\001\002\000\004\025\073\001\002\000\004\011\074\001" +
    "\002\000\004\025\075\001\002\000\042\002\ufffa\004\ufffa" +
    "\005\ufffa\006\ufffa\007\ufffa\010\ufffa\012\ufffa\013\ufffa\014" +
    "\ufffa\015\ufffa\016\ufffa\017\ufffa\020\ufffa\023\ufffa\025\ufffa" +
    "\026\ufffa\001\002\000\004\011\077\001\002\000\004\025" +
    "\100\001\002\000\042\002\ufff6\004\ufff6\005\ufff6\006\ufff6" +
    "\007\ufff6\010\ufff6\012\ufff6\013\ufff6\014\ufff6\015\ufff6\016" +
    "\ufff6\017\ufff6\020\ufff6\023\ufff6\025\ufff6\026\ufff6\001\002" +
    "\000\004\011\102\001\002\000\004\025\103\001\002\000" +
    "\004\011\104\001\002\000\004\024\105\001\002\000\042" +
    "\002\ufff2\004\ufff2\005\ufff2\006\ufff2\007\ufff2\010\ufff2\012" +
    "\ufff2\013\ufff2\014\ufff2\015\ufff2\016\ufff2\017\ufff2\020\ufff2" +
    "\023\ufff2\025\ufff2\026\ufff2\001\002\000\042\002\ufff5\004" +
    "\ufff5\005\ufff5\006\ufff5\007\ufff5\010\ufff5\012\ufff5\013\ufff5" +
    "\014\ufff5\015\ufff5\016\ufff5\017\ufff5\020\ufff5\023\ufff5\025" +
    "\ufff5\026\ufff5\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\104\000\004\002\003\001\001\000\006\003\013\004" +
    "\005\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\004\033\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$BestParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$BestParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$BestParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return lexer.next_token(); 
    }

 
  BestLexer lexer;
 
  public int instructionNum;
  public Hashtable<String, Integer> labels;

  public BestParser(BestLexer lex, Hashtable<String, Integer> hash) {
      super(lex);
      lexer = lex;
      labels = hash;
  }


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$BestParser$actions {
  private final BestParser parser;

  /** Constructor */
  CUP$BestParser$actions(BestParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$BestParser$do_action(
    int                        CUP$BestParser$act_num,
    java_cup.runtime.lr_parser CUP$BestParser$parser,
    java.util.Stack            CUP$BestParser$stack,
    int                        CUP$BestParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$BestParser$result;

      /* select the action based on the action number */
      switch (CUP$BestParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expr ::= REGISTER 
            {
              Node RESULT =null;
		int rleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).right;
		Integer r = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.peek()).value;
		 RESULT = new RegisterNode(r); 
              CUP$BestParser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), RESULT);
            }
          return CUP$BestParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= LB REGISTER COMMA INT LPAREN REGISTER RPAREN 
            {
              Node RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-5)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-5)).right;
		Integer l = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.elementAt(CUP$BestParser$top-5)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-3)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-3)).right;
		Integer r = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.elementAt(CUP$BestParser$top-3)).value;
		int jleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-1)).left;
		int jright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-1)).right;
		Integer j = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.elementAt(CUP$BestParser$top-1)).value;
		 RESULT = new LbInstruction(new RegisterNode(l), new IntNode(r), new RegisterNode(j)); 
              CUP$BestParser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-6)), ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), RESULT);
            }
          return CUP$BestParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= SB REGISTER COMMA INT LPAREN REGISTER RPAREN 
            {
              Node RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-5)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-5)).right;
		Integer l = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.elementAt(CUP$BestParser$top-5)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-3)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-3)).right;
		Integer r = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.elementAt(CUP$BestParser$top-3)).value;
		int jleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-1)).left;
		int jright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-1)).right;
		Integer j = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.elementAt(CUP$BestParser$top-1)).value;
		 RESULT = new SbInstruction(new RegisterNode(l), new IntNode(r), new RegisterNode(j)); 
              CUP$BestParser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-6)), ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), RESULT);
            }
          return CUP$BestParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= BEQ REGISTER COMMA REGISTER COMMA JUMPTARGET 
            {
              Node RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-4)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-4)).right;
		Integer l = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.elementAt(CUP$BestParser$top-4)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-2)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-2)).right;
		Integer r = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.elementAt(CUP$BestParser$top-2)).value;
		int jleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).left;
		int jright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).right;
		String j = (String)((java_cup.runtime.Symbol) CUP$BestParser$stack.peek()).value;
		 RESULT = new BeqInstruction(new RegisterNode(l), new RegisterNode(r), new LabelNode(j)); 
              CUP$BestParser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-5)), ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), RESULT);
            }
          return CUP$BestParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expr ::= JUMP JUMPTARGET 
            {
              Node RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).right;
		String l = (String)((java_cup.runtime.Symbol) CUP$BestParser$stack.peek()).value;
		 RESULT = new JumpInstruction(new LabelNode(l)); 
              CUP$BestParser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-1)), ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), RESULT);
            }
          return CUP$BestParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= HALT 
            {
              Node RESULT =null;
		 RESULT = new HaltInstruction(); 
              CUP$BestParser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), RESULT);
            }
          return CUP$BestParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= DISP REGISTER 
            {
              Node RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).right;
		Integer d = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.peek()).value;
		 RESULT = new DispInstruction(new RegisterNode(d)); 
              CUP$BestParser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-1)), ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), RESULT);
            }
          return CUP$BestParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= RAND REGISTER COMMA REGISTER 
            {
              Node RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-2)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-2)).right;
		Integer d = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.elementAt(CUP$BestParser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).right;
		Integer s = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.peek()).value;
		 RESULT = new RandInstruction(new RegisterNode(d), new RegisterNode(s)); 
              CUP$BestParser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-3)), ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), RESULT);
            }
          return CUP$BestParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= XOR REGISTER COMMA REGISTER COMMA REGISTER 
            {
              Node RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-4)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-4)).right;
		Integer d = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.elementAt(CUP$BestParser$top-4)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-2)).right;
		Integer s = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.elementAt(CUP$BestParser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).right;
		Integer t = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.peek()).value;
		 RESULT = new XorInstruction(new RegisterNode(d), new RegisterNode(s), new RegisterNode(t)); 
              CUP$BestParser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-5)), ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), RESULT);
            }
          return CUP$BestParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= SLT REGISTER COMMA REGISTER COMMA REGISTER 
            {
              Node RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-4)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-4)).right;
		Integer d = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.elementAt(CUP$BestParser$top-4)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-2)).right;
		Integer s = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.elementAt(CUP$BestParser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).right;
		Integer t = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.peek()).value;
		 RESULT = new SLTInstruction(new RegisterNode(d), new RegisterNode(s), new RegisterNode(t)); 
              CUP$BestParser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-5)), ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), RESULT);
            }
          return CUP$BestParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= ADDI REGISTER COMMA REGISTER COMMA INT 
            {
              Node RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-4)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-4)).right;
		Integer d = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.elementAt(CUP$BestParser$top-4)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-2)).right;
		Integer s = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.elementAt(CUP$BestParser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).right;
		Integer t = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.peek()).value;
		 RESULT = new AddiInstruction(new RegisterNode(d), new RegisterNode(s), new IntNode(t)); 
              CUP$BestParser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-5)), ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), RESULT);
            }
          return CUP$BestParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= SUB REGISTER COMMA REGISTER COMMA REGISTER 
            {
              Node RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-4)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-4)).right;
		Integer d = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.elementAt(CUP$BestParser$top-4)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-2)).right;
		Integer s = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.elementAt(CUP$BestParser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).right;
		Integer t = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.peek()).value;
		 RESULT = new SubInstruction(new RegisterNode(d), new RegisterNode(s), new RegisterNode(t)); 
              CUP$BestParser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-5)), ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), RESULT);
            }
          return CUP$BestParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= ADD REGISTER COMMA REGISTER COMMA REGISTER 
            {
              Node RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-4)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-4)).right;
		Integer d = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.elementAt(CUP$BestParser$top-4)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-2)).right;
		Integer s = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.elementAt(CUP$BestParser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).right;
		Integer t = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.peek()).value;
		 RESULT = new AddInstruction(new RegisterNode(d), new RegisterNode(s), new RegisterNode(t)); 
              CUP$BestParser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-5)), ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), RESULT);
            }
          return CUP$BestParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr ::= INT 
            {
              Node RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).right;
		Integer i = (Integer)((java_cup.runtime.Symbol) CUP$BestParser$stack.peek()).value;
		 RESULT = new IntNode(i); 
              CUP$BestParser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), RESULT);
            }
          return CUP$BestParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // line ::= LABEL expr 
            {
              Node RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-1)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-1)).right;
		String l = (String)((java_cup.runtime.Symbol) CUP$BestParser$stack.elementAt(CUP$BestParser$top-1)).value;
		int resultleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).left;
		int resultright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).right;
		Node result = (Node)((java_cup.runtime.Symbol) CUP$BestParser$stack.peek()).value;
		 RESULT = result; parser.labels.put(l, parser.instructionNum - 1); parser.instructionNum++; 
              CUP$BestParser$result = parser.getSymbolFactory().newSymbol("line",1, ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-1)), ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), RESULT);
            }
          return CUP$BestParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // line ::= expr 
            {
              Node RESULT =null;
		int resultleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).left;
		int resultright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).right;
		Node result = (Node)((java_cup.runtime.Symbol) CUP$BestParser$stack.peek()).value;
		 RESULT = result; parser.instructionNum++; 
              CUP$BestParser$result = parser.getSymbolFactory().newSymbol("line",1, ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), RESULT);
            }
          return CUP$BestParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // line_list ::= 
            {
              ArrayList<Node> RESULT =null;

              CUP$BestParser$result = parser.getSymbolFactory().newSymbol("line_list",0, ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), RESULT);
            }
          return CUP$BestParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // line_list ::= line_list line 
            {
              ArrayList<Node> RESULT =null;
		int listleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-1)).left;
		int listright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-1)).right;
		ArrayList<Node> list = (ArrayList<Node>)((java_cup.runtime.Symbol) CUP$BestParser$stack.elementAt(CUP$BestParser$top-1)).value;
		int lleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()).right;
		Node l = (Node)((java_cup.runtime.Symbol) CUP$BestParser$stack.peek()).value;
		 if(list == null) 
		list = new ArrayList<Node>();
	   list.add(l);
	   RESULT = list;
	
              CUP$BestParser$result = parser.getSymbolFactory().newSymbol("line_list",0, ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-1)), ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), RESULT);
            }
          return CUP$BestParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= line_list EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-1)).right;
		ArrayList<Node> start_val = (ArrayList<Node>)((java_cup.runtime.Symbol) CUP$BestParser$stack.elementAt(CUP$BestParser$top-1)).value;
		RESULT = start_val;
              CUP$BestParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$BestParser$stack.elementAt(CUP$BestParser$top-1)), ((java_cup.runtime.Symbol)CUP$BestParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$BestParser$parser.done_parsing();
          return CUP$BestParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
