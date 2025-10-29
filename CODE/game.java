public class game {
    public static BufferedImage texture1; // ← this is the shared texture

    public void loadTextures() {
        try {
            texture1 = ImageIO.read(new File("dir.png")); // ← assign to the static field
        } catch (IOException e) {
            System.err.println("Texture load failed.");
            e.printStackTrace();
        }
    }

    public game() {
        loadTextures(); // ← loads into texture1 before run() is ever called
    }

    public static spawner sp = new spawner();

    public static void run(Graphics2D g2d, int width, int height, dP context) {
        if (texture1 == null) {
            System.err.println("run(): texture1 is null — skipping drawMesh.");
            return;
        }
        context.drawMesh(sp.LFYS(0, 0, 25, 0, context.i, context.i), g2d, texture1);
    }

    public static void Update(dP context) {
        context.i += 0.1;
    }
}
