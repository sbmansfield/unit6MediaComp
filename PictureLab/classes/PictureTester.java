/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture(704, 1500);
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorVerticalRightToLeft();
      caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorHorizontal();
      caterpillar.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorHorizontalBotToTop();
      caterpillar.explore();
  }
  
  public static void testMirrorArms()
  {
      Picture snowman = new Picture("snowman.jpg");
      snowman.explore();
      snowman.mirrorArms();
      snowman.explore();
  } 
  
  public static void testMirrorGull()
  {
      Picture seagull = new Picture("seagull.jpg");
      seagull.explore();
      seagull.mirrorGull();
      seagull.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.keepOnlyBlue();
      caterpillar.explore();
  }
  
  public static void testNegate()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.negate();
      caterpillar.explore();
  }
  
  public static void testGrayscale()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.grayscale();
      caterpillar.explore();
  }
  
  public static void testFixUnderwater()
  {
      Picture water = new Picture("water.jpg");
      water.explore();
      water.fixUnderwater();
      water.explore();
  }
  
  public static void testCropAndCopy()
  {
      Picture seagull = new Picture("seagull.jpg");
      Picture caterpillar = new Picture("caterpillar.jpg");
      seagull.explore();
      seagull.cropAndCopy(caterpillar, 10, 100, 20, 200, 300, 400);
      seagull.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    testNegate();
    testGrayscale();
    testFixUnderwater();
    testMirrorVertical();
    testMirrorTemple();
    testMirrorArms();
    testMirrorGull();
    //testMirrorDiagonal();
    testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    testMirrorVerticalRightToLeft();
    testMirrorHorizontal();
    
    testCropAndCopy();
  }
}