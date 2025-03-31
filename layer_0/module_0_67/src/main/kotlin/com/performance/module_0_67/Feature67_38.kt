package com.performance.module_0_67

class Feature67UseCase2(
    private val repository: Feature67Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
