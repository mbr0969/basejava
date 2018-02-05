import java.util.Arrays;

public class ArrayStorage {
    Resume[] storage = new Resume[10];
    private int size =0;


    void clear() {
        Arrays.fill(storage, null);
        size =0;

    }

    void save(Resume r) {
        storage[size++] = r;
    }

    Resume get(String uuid) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                if (storage[i].toString().equals(uuid)) {
                    return storage[i];
                }
            }
        }
        return null;
    }

    void delete(String uuid) {
        for (int j  = 0 ; j < size; j++) {
          if (storage[j].toString().equals(uuid))
            for (int k = j; k < size-1; k++) {
                storage[k] = storage[k + 1];
            }
        }
        size--;
        storage[size] =null;


    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
           return storage;
    }

    int size() {
        return size;
    }
}
