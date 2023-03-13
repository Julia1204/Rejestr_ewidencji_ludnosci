package model;

 public class InvalidItemDataException extends RuntimeException {
        private final String message = "Invalid data";

        @Override
        public String getMessage() {
            return message;
        }
    }

