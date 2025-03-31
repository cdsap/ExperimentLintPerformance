package com.performance.module_4_294

class Feature294UseCase2(
    private val repository: Feature294Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
