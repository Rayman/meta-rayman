# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Turn any folder on your computer into a cute file browser, available on the local network."
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   node_modules/express/node_modules/body-parser/node_modules/qs/LICENSE
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "ISC & MIT & BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=71d98c0a1db42956787b1909c74a86ca \
                    file://node_modules/express/LICENSE;md5=5513c00a5c36cd361da863dd9aa8875d \
                    file://node_modules/express/node_modules/utils-merge/LICENSE;md5=1cf0906082187f374cb9a63c54eb782c \
                    file://node_modules/express/node_modules/range-parser/LICENSE;md5=d4246fb961a4f121eef5ffca47f0b010 \
                    file://node_modules/express/node_modules/vary/LICENSE;md5=13babc4f212ce635d68da544339c962b \
                    file://node_modules/express/node_modules/methods/LICENSE;md5=c16a7dd9f946172f07086576d135d9d3 \
                    file://node_modules/express/node_modules/escape-html/LICENSE;md5=f8746101546eeb9e4f6de64bb8bdf595 \
                    file://node_modules/express/node_modules/path-to-regexp/LICENSE;md5=44088ba57cb871a58add36ce51b8de08 \
                    file://node_modules/express/node_modules/accepts/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/express/node_modules/accepts/node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/express/node_modules/accepts/node_modules/mime-types/node_modules/mime-db/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/express/node_modules/accepts/node_modules/negotiator/LICENSE;md5=6417a862a5e35c17c904d9dda2cbd499 \
                    file://node_modules/express/node_modules/serve-static/LICENSE;md5=27b1707520b14d0bc890f4e75cd387b0 \
                    file://node_modules/express/node_modules/send/LICENSE;md5=df2b0938eba0709b77ac937e2d552b7a \
                    file://node_modules/express/node_modules/send/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/express/node_modules/send/node_modules/destroy/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/express/node_modules/send/node_modules/http-errors/LICENSE;md5=607209623abfcc77b9098f71a0ef52f9 \
                    file://node_modules/express/node_modules/send/node_modules/http-errors/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/express/node_modules/send/node_modules/mime/LICENSE;md5=8e8ea2ad138ce468f8570a0edbadea65 \
                    file://node_modules/express/node_modules/type-is/LICENSE;md5=0afd201e48c7d095454eed4ac1184e40 \
                    file://node_modules/express/node_modules/cookie/LICENSE;md5=bc85b43b6f963e8ab3f88e63628448ca \
                    file://node_modules/express/node_modules/proxy-addr/LICENSE;md5=6e8686b7b13dd7ac8733645a81842c4a \
                    file://node_modules/express/node_modules/proxy-addr/node_modules/forwarded/LICENSE;md5=13babc4f212ce635d68da544339c962b \
                    file://node_modules/express/node_modules/proxy-addr/node_modules/ipaddr.js/LICENSE;md5=88f60a4b6e44cb849b5d907a7664c0ef \
                    file://node_modules/express/node_modules/content-disposition/LICENSE;md5=13babc4f212ce635d68da544339c962b \
                    file://node_modules/express/node_modules/content-disposition/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/express/node_modules/encodeurl/LICENSE;md5=272621efa0ff4f18a73221e49ab60654 \
                    file://node_modules/express/node_modules/body-parser/LICENSE;md5=0afd201e48c7d095454eed4ac1184e40 \
                    file://node_modules/express/node_modules/body-parser/node_modules/depd/LICENSE;md5=13babc4f212ce635d68da544339c962b \
                    file://node_modules/express/node_modules/body-parser/node_modules/qs/LICENSE;md5=d5c7c6dc45a33a0a9620ed81315672d7 \
                    file://node_modules/express/node_modules/body-parser/node_modules/iconv-lite/LICENSE;md5=f942263d98f0d75e0e0101884e86261d \
                    file://node_modules/express/node_modules/body-parser/node_modules/iconv-lite/node_modules/safer-buffer/LICENSE;md5=3baebc2a17b8f5bff04882cd0dc0f76e \
                    file://node_modules/express/node_modules/body-parser/node_modules/type-is/LICENSE;md5=0afd201e48c7d095454eed4ac1184e40 \
                    file://node_modules/express/node_modules/body-parser/node_modules/type-is/node_modules/media-typer/LICENSE;md5=c6e0ce1e688c5ff16db06b7259e9cd20 \
                    file://node_modules/express/node_modules/body-parser/node_modules/raw-body/LICENSE;md5=c970d30155ebbdb1903e6de8c0666e18 \
                    file://node_modules/express/node_modules/body-parser/node_modules/raw-body/node_modules/unpipe/LICENSE;md5=934ab86a8ab081ea0326add08d550739 \
                    file://node_modules/express/node_modules/body-parser/node_modules/content-type/LICENSE;md5=f4b767f006864f81a4901347fe4efdab \
                    file://node_modules/express/node_modules/body-parser/node_modules/bytes/LICENSE;md5=013e95467eddb048f19a6f5b42820f86 \
                    file://node_modules/express/node_modules/body-parser/node_modules/on-finished/LICENSE;md5=1b1f7f9cec194121fdf616b971df7a7b \
                    file://node_modules/express/node_modules/body-parser/node_modules/on-finished/node_modules/ee-first/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/express/node_modules/body-parser/node_modules/http-errors/LICENSE;md5=607209623abfcc77b9098f71a0ef52f9 \
                    file://node_modules/express/node_modules/body-parser/node_modules/http-errors/node_modules/toidentifier/LICENSE;md5=1a261071a044d02eb6f2bb47f51a3502 \
                    file://node_modules/express/node_modules/body-parser/node_modules/http-errors/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/express/node_modules/body-parser/node_modules/http-errors/node_modules/setprototypeof/LICENSE;md5=4846f1626304c2c0f806a539bbc7d54a \
                    file://node_modules/express/node_modules/body-parser/node_modules/http-errors/node_modules/statuses/LICENSE;md5=36e2bc837ce69a98cc33a9e140d457e5 \
                    file://node_modules/express/node_modules/body-parser/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/express/node_modules/body-parser/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/express/node_modules/fresh/LICENSE;md5=373c2cf0978b37e434394a43b4cbbdb4 \
                    file://node_modules/express/node_modules/array-flatten/LICENSE;md5=44088ba57cb871a58add36ce51b8de08 \
                    file://node_modules/express/node_modules/finalhandler/LICENSE;md5=b506956e5cbfbe0d04f8a5c40107ec89 \
                    file://node_modules/express/node_modules/finalhandler/node_modules/unpipe/LICENSE;md5=934ab86a8ab081ea0326add08d550739 \
                    file://node_modules/express/node_modules/finalhandler/node_modules/parseurl/LICENSE;md5=e7842ed4f188e53e53c3e8d9c4807e89 \
                    file://node_modules/express/node_modules/finalhandler/node_modules/statuses/LICENSE;md5=36e2bc837ce69a98cc33a9e140d457e5 \
                    file://node_modules/express/node_modules/merge-descriptors/LICENSE;md5=aaf57ba8c5c9bf256fea7e943991a81a \
                    file://node_modules/express/node_modules/etag/LICENSE;md5=6e8686b7b13dd7ac8733645a81842c4a \
                    file://node_modules/content-disposition/LICENSE;md5=c6e0ce1e688c5ff16db06b7259e9cd20 \
                    file://node_modules/commander/LICENSE;md5=25851d4d10d6611a12d5571dab945a00"

SRC_URI = "npm://registry.npmjs.org/;name=cute-files;version=${PV} \
	file://cute-files.service \
	"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"

inherit npm

# Must be set after inherit npm since that itself sets S
S = "${WORKDIR}/npmpkg"
LICENSE_${PN}-commander = "MIT"
LICENSE_${PN}-content-disposition = "MIT"
LICENSE_${PN}-express-accepts-mime-types-mime-db = "MIT"
LICENSE_${PN}-express-accepts-mime-types = "MIT"
LICENSE_${PN}-express-accepts-negotiator = "MIT"
LICENSE_${PN}-express-accepts = "MIT"
LICENSE_${PN}-express-array-flatten = "MIT"
LICENSE_${PN}-express-body-parser-bytes = "MIT"
LICENSE_${PN}-express-body-parser-content-type = "MIT"
LICENSE_${PN}-express-body-parser-debug-ms = "MIT"
LICENSE_${PN}-express-body-parser-debug = "MIT"
LICENSE_${PN}-express-body-parser-depd = "MIT"
LICENSE_${PN}-express-body-parser-http-errors-inherits = "ISC"
LICENSE_${PN}-express-body-parser-http-errors-setprototypeof = "ISC"
LICENSE_${PN}-express-body-parser-http-errors-statuses = "MIT"
LICENSE_${PN}-express-body-parser-http-errors-toidentifier = "MIT"
LICENSE_${PN}-express-body-parser-http-errors = "MIT"
LICENSE_${PN}-express-body-parser-iconv-lite-safer-buffer = "MIT"
LICENSE_${PN}-express-body-parser-iconv-lite = "MIT"
LICENSE_${PN}-express-body-parser-on-finished-ee-first = "MIT"
LICENSE_${PN}-express-body-parser-on-finished = "MIT"
LICENSE_${PN}-express-body-parser-qs = "BSD-3-Clause"
LICENSE_${PN}-express-body-parser-raw-body-unpipe = "MIT"
LICENSE_${PN}-express-body-parser-raw-body = "MIT"
LICENSE_${PN}-express-body-parser-type-is-media-typer = "MIT"
LICENSE_${PN}-express-body-parser-type-is = "MIT"
LICENSE_${PN}-express-body-parser = "MIT"
LICENSE_${PN}-express-content-disposition-safe-buffer = "MIT"
LICENSE_${PN}-express-content-disposition = "MIT"
LICENSE_${PN}-express-cookie-signature = "MIT"
LICENSE_${PN}-express-cookie = "MIT"
LICENSE_${PN}-express-encodeurl = "MIT"
LICENSE_${PN}-express-escape-html = "MIT"
LICENSE_${PN}-express-etag = "MIT"
LICENSE_${PN}-express-finalhandler-parseurl = "MIT"
LICENSE_${PN}-express-finalhandler-statuses = "MIT"
LICENSE_${PN}-express-finalhandler-unpipe = "MIT"
LICENSE_${PN}-express-finalhandler = "MIT"
LICENSE_${PN}-express-fresh = "MIT"
LICENSE_${PN}-express-merge-descriptors = "MIT"
LICENSE_${PN}-express-methods = "MIT"
LICENSE_${PN}-express-path-to-regexp = "MIT"
LICENSE_${PN}-express-proxy-addr-forwarded = "MIT"
LICENSE_${PN}-express-proxy-addr-ipaddr.js = "MIT"
LICENSE_${PN}-express-proxy-addr = "MIT"
LICENSE_${PN}-express-range-parser = "MIT"
LICENSE_${PN}-express-send-destroy = "MIT"
LICENSE_${PN}-express-send-http-errors-inherits = "ISC"
LICENSE_${PN}-express-send-http-errors = "MIT"
LICENSE_${PN}-express-send-mime = "MIT"
LICENSE_${PN}-express-send-ms = "MIT"
LICENSE_${PN}-express-send = "MIT"
LICENSE_${PN}-express-serve-static = "MIT"
LICENSE_${PN}-express-type-is = "MIT"
LICENSE_${PN}-express-utils-merge = "MIT"
LICENSE_${PN}-express-vary = "MIT"
LICENSE_${PN}-express = "MIT"
LICENSE_${PN} = "MIT"

# Start cute-files on boot

SYSTEMD_SERVICE_${PN} = " \
	cute-files.service \
	"

do_install() {
	install -d ${D}${systemd_unitdir}/system
	install -m 0644 ${WORKDIR}/cute-files.service ${D}${systemd_unitdir}/system/
}

FILES_${PN} += "${systemd_unitdir}/system/cute-files.service"

