provider "aws" {
region = "us-east-1"
access_key = "AKIAUPFWGOROT6FT5QYZ"
secret_key = "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"
}

resource "aws_instance" "ec2" {
    ami = "ami-0778521d914d23bc1"
    instance_type = "t2.micro"
    key_name= "devops"
}

resource "aws_security_group" "main" {
  egress = [
    {
      cidr_blocks      = [ "0.0.0.0/0", ]
      description      = ""
      from_port        = 0
      ipv6_cidr_blocks = []
      prefix_list_ids  = []
      protocol         = "-1"
      security_groups  = []
      self             = false
      to_port          = 0
    }
  ]
 ingress                = [
   {
     cidr_blocks      = [ "0.0.0.0/0", ]
     description      = ""
     from_port        = 22
     ipv6_cidr_blocks = []
     prefix_list_ids  = []
     protocol         = "tcp"
     security_groups  = []
     self             = false
     to_port          = 22
  }
  ]
}
