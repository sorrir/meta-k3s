require k3s-bin-arch.inc

K3S_VERSION ?= "1.20.4"
K3S_SHA_ARM ?= "6567e3773022bd1a44514ddfb4da74efd2ec6cbb6b30ea5f89e70c4590173763"
K3S_SHA_ARM64 ?= "d84a07f1438352d26f9fbcf1c3e839d6523d3e1231030b7a9b2b639b8a7dfc30"
K3S_SHA_AMD64 ?= "1c7b68b0b7d54f21a9c1727545a7db181668115f161a3986bc137261dd817e98"
PR = "${INC_PR}.1"
PV = "${K3S_VERSION}-${PR}"
BB_STRICT_CHECKSUM = "0"