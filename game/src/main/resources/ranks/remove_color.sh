#!/bin/bash

# Check if ImageMagick is installed
if ! command -v convert &> /dev/null; then
    echo "ImageMagick is not installed. Please install it and try again."
    exit 1
fi

# Directory containing the PNG files (current directory)
DIRECTORY=$(pwd)

# Iterate over all PNG files in the directory
for file in "$DIRECTORY"/*.png; do
    if [ -f "$file" ]; then
        echo "Processing $file..."
        # Use ImageMagick to replace color #ff00ff with transparency
        convert "$file" -fuzz 1% -transparent "#ff00ff" "$file"
        echo "$file processed."
    else
        echo "No PNG files found in $DIRECTORY"
    fi
done

echo "All files processed."
