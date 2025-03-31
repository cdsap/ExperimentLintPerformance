package com.performance.module_0_67

class Feature67UseCase1(
    private val repository: Feature67Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
