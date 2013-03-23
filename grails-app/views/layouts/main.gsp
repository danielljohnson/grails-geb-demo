<!DOCTYPE html>
<html>
<head>
<title><g:layoutTitle /></title>
<link rel="stylesheet/less" href="${resource(dir:'bootstrap/lib',file:'bootstrap.less')}">
<link rel="stylesheet/less" href="${resource(dir:'css',file:'main.less')}" />
<g:javascript library="less-1.1.3.min" />
<g:javascript library="jquery" />
<g:javascript library="main" />
<g:layoutHead />
</head>
<body>
    
<div class="topbar">
    <div class="fill">
        <div class="container">
            <a class="brand" href="${createLinkTo(dir:'')}">Grails Geb Demo</a>
        </div>
    </div>
</div>

<div class="container">
    <div class="content">
        <g:layoutBody />
    </div>
</div>

</body>
</html>