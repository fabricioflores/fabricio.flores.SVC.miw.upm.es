#echo off
export workspace=~/Documents/workspace/tarea2VGIW
echo -----------------------------------------
echo ". (C) MIW"
echo -----------------------------------------
echo .
echo Workspace --- $workspace
echo .
echo .

cd $workspace
echo "============ mvn -ff clean test (profile: develop) ========================================================================"
echo .
mvn -ff clean test 
if [ $? -gt 0 ] ; then
	echo .
	echo .
	echo .
	echo "########  ERRORES..."
else
	echo .
	echo "============ mvn -Dmaven.test.skip=true install -Denvironment.type=preproduction (profile: preproduction) ============="
	echo .
	mvn -Dmaven.test.skip=true install -Denvironment.type=preproduction
	exit    
fi
