
class Product {

    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String toString() {
        return "[" + productId + " - " + productName + " - " + category + "]";
    }
}

class SearchUtils {

    public static Product linearSearch(Product[] products, String target) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(target)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String target) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].productName.compareToIgnoreCase(target);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}

public class Main {

    public static void main(String[] args) {
        // Unsorted array for linear search
        Product[] products = {
            new Product(1, "Shoes", "Footwear"),
            new Product(2, "Shirt", "Clothing"),
            new Product(3, "Phone", "Electronics"),
            new Product(4, "Shorts", "Clothing")
        };

        // Sorted array for binary search (sorted by productName)
        Product[] sortedProducts = {
            new Product(3, "Phone", "Electronics"),
            new Product(2, "Shirt", "Clothing"),
            new Product(1, "Shoes", "Footwear"),
            new Product(4, "Shorts", "Clothing")
        };

        Product result1 = SearchUtils.linearSearch(products, "Phone");
        System.out.println("Linear Search Result: " + result1);

        Product result2 = SearchUtils.binarySearch(sortedProducts, "Shoes");
        System.out.println("Binary Search Result: " + result2);
    }
}
