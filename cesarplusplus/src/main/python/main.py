import subprocess
import re
import os
import sys
import ast

if __name__ == "__main__":
	
	sub_path = sys.argv[1]
	in_path = sys.argv[2]
	out_path = sys.argv[3]

	with open(in_path + ".txt") as f:
		input = ast.literal_eval(f.read())
		
	with open(out_path + ".txt") as f:
		output = ast.literal_eval(f.read())
	

	report = open('report.txt','w', encoding='UTF-8')

	tests = [0] * len(input)

	os.system("gcc -std=c99 ../questions/" + sub_path + ".c -o submission")
	
	if not os.path.isfile("submission.exe"):
		report.write(sub_path + ".c fail on compilation\n")

	if os.path.isfile("submission.exe"):
		for index, i in enumerate(input):

			process = subprocess.Popen('./submission.exe', stdout=subprocess.PIPE, stdin=subprocess.PIPE)
			process.stdin.write(i.encode('UTF-8'))
			process.stdin.close()
			usr_out = process.stdout.read().decode('UTF-8')
			usr_out = re.sub(r'\r\n', r'\n', usr_out)

			process.wait()

			if not (usr_out.split() == output[index].split()):
				if (usr_out[0] != '\n'):
					usr_out = '\n' + usr_out
				report.write("Caso " + str(index + 1) + " X\n\nExpected: " + re.sub(r'\n', r'\n\t', output[index]) + "\nNot:" + re.sub(r'\n', r'\n\t', usr_out) + "\n\n")
			else:
				tests[index] = 1
				report.write("Caso " + str(index + 1) + " ✓\n")

		report.write("\ntests: " + " | ".join(str(e) for e in tests))
		report.write("\nTotal: " + str(sum(tests)) + "/" + str(len(tests)))

	report.close()

