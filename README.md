# gmstruct
Generate structs for use in GameMaker

Forum topic:
https://forum.yoyogames.com/index.php?threads/gmstruct-struct-generation-for-gamemaker-studio.29731/

# Example struct definition file
```gml
struct foo {
  x,
  y,
  n = 0
}

struct bar : foo {
  size
}
```
# Using generated source
```gml
var foo = new_foo(1,1); //creates a new foo struct
var x = foo_x(foo); //gets a struct attribute
foo_x(foo, 4); //sets a struct attribute

if (is_foo(foo)) { //Checks the type of a struct
    //do shomething
}

if (is_a(foo, structs.foo)) { //Also checks a type
    //do something also
}
```

#Name Spaces
```gml
namespace net {
    struct foo {
    x,
    y,
      n = 0
    }
}
```
structs are prefixed with their namespace name in GML.
Above example will yield a struct named net_foo