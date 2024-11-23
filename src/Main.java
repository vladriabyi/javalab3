import java.util.Arrays;

public class Main {
    public static class BuildingBlock {
        private String name;
        private String material;
        private int hardness;
        private boolean isTransparent;
        private int stackLimit;

        public BuildingBlock(String name, String material, int hardness, boolean isTransparent, int stackLimit) {
            this.name = name;
            this.material = material;
            this.hardness = hardness;
            this.isTransparent = isTransparent;
            this.stackLimit = stackLimit;
        }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getMaterial() { return material; }
        public void setMaterial(String material) { this.material = material; }
        public int getHardness() { return hardness; }
        public void setHardness(int hardness) { this.hardness = hardness; }
        public boolean isTransparent() { return isTransparent; }
        public void setTransparent(boolean transparent) { isTransparent = transparent; }
        public int getStackLimit() { return stackLimit; }
        public void setStackLimit(int stackLimit) { this.stackLimit = stackLimit; }

        @Override
        public String toString() {
            return "BuildingBlock{" +
                   "name='" + name + '\'' +
                   ", material='" + material + '\'' +
                   ", hardness=" + hardness +
                   ", isTransparent=" + isTransparent +
                   ", stackLimit=" + stackLimit +
                   '}';
        }
    }

    public static void main(String[] args) {
        BuildingBlock[] blocks = {
            new BuildingBlock("Stone", "Rock", 3, false, 64),
            new BuildingBlock("Glass", "Silica", 1, true, 64),
            new BuildingBlock("Diamond", "Diamond", 5, false, 64),
            new BuildingBlock("Wood", "Wood", 2, false, 64),
            new BuildingBlock("Lapis", "Stone", 4, false, 64)
        };

        // Sorting 
    }
}
