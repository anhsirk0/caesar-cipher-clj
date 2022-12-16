# caesar-cipher
[Caesar cipher](https://en.wikipedia.org/wiki/Caesar_cipher) encryption implementation in Clojure for practice.

## Usage
```bash
 $ lein run -- -h
```

## Options
```text
  -k, --key KEY      13  Key to shift the alphabets
  -d, --decode TEXT      Text to decode.
  -e, --encode TEXT      Text to encode.
  -h, --help
```


## Examples
```bash
$ lein run -- -k -3 -e "The quick brown fox jumps over the lazy dog."
QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD.
```

```bash
$ lein run -- -k -3 -d "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD."
THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
```

