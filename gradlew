#!/usr/bin/env sh

##############################################################################
##
##  Gradle start up script for UN*X
##
##############################################################################

# Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
DEFAULT_JVM_OPTS=""

APP_NAME="Gradle"
APP_BASE_NAME=$(basename "$0")

# Use the maximum available, or set MAX_FD != -1 to use that value.
MAX_FD="maximum"

warn () {
    echo "$*" >&2
}

die () {
    echo
    echo "$*" >&2
    echo
    exit 1
}

# OS specific support (must be 'true' or 'false').
darwin=false
case "$(uname)" in
    Darwin*) darwin=true ;;
esac

# Attempt to set APP_HOME
# Resolve links: $0 may be a link
PRG="$0"
# Need this for relative symlinks.
while [ -h "$PRG" ] ; do
    ls=$(ls -ld "$PRG")
    link=$(expr "$ls" : '.*-> \(.*\)$')
    if expr "$link" : '/.*' > /dev/null; then
        PRG="$link"
    else
        PRG=$(dirname "$PRG")/"$link"
    fi
done
SAVED="pwd"
cd "$(dirname "$PRG")" || exit 1
APP_HOME=$(pwd -P)
cd "$SAVED" || exit 1

CLASSPATH=$APP_HOME/gradle/wrapper/gradle-wrapper.jar

# Determine the Java command to use to start the JVM.
if [ -n "$JAVA_HOME" ] ; then
    if [ -x "$JAVA_HOME/jre/sh/java" ] ; then
        # IBM's JDK on AIX uses strange locations for the executables
        JAVACMD="$JAVA_HOME/jre/sh/java"
    else
        JAVACMD="$JAVA_HOME/bin/java"
    fi
    if [ ! -x "$JAVACMD" ] ; then
        die "ERROR: JAVA_HOME is set to an invalid directory: $JAVA_HOME

Please set the JAVA_HOME variable in your environment to match the
location of your Java installation."
    fi
else
    JAVACMD=java
    which java >/dev/null 2>&1 || die "ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.

Please set the JAVA_HOME variable in your environment to match the
location of your Java installation."
fi

# Increase the maximum file descriptors if we can.
if [ "$MAX_FD" != "maximum" ]; then
    MAX_FD_LIMIT=$(ulimit -H -n)
    if [ "$?" -eq 0 ]; then
        if [ "$MAX_FD" = "maximum" ] || [ "$MAX_FD" -gt "$MAX_FD_LIMIT" ]; then
            MAX_FD="$MAX_FD_LIMIT"
        fi
    fi
    ulimit -n "$MAX_FD" || warn "Could not set maximum file descriptor limit: $MAX_FD"
fi

# For Darwin, add options to specify how the application appears in the dock
if $darwin; then
    GRADLE_OPTS="$GRADLE_OPTS -Xdock:name=$APP_NAME"
fi

# Escape application args
save () {
    for i in "$@"; do
        printf "%s\n" "$i"
    done | LC_ALL=C sed 's/[ ]/\\&/g' | tr '\n' ' '
}

# Collect all arguments for the java command, following shell quoting and expansion rules
ALL_JVM_OPTS=$(save $DEFAULT_JVM_OPTS $JAVA_OPTS $GRADLE_OPTS)
ALL_APP_ARGS=$(save "$@")

# By default the JVM comes with 2.5MB stack but for some tasks this is too small and leads to segfaults.
# This is a not so fine grained approach to increase the stack to 10MB.
# We're following the discussion on http://github.com/gradle/gradle/issues/10574.
if [ -z "${GRADLE_OPTS##*-Xss*}" ]; then
  ALL_JVM_OPTS="$ALL_JVM_OPTS -Xss10m"
fi

# Collect all JVM arguments and application arguments into a single command line
COMMAND_LINE="$JAVACMD $ALL_JVM_OPTS -classpath $CLASSPATH org.gradle.wrapper.GradleWrapperMain $ALL_APP_ARGS"

# Execute the JVM
eval exec "$COMMAND_LINE"
